package com.mock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceMockTest {

    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

    @Test
    public void givenCheckifEqualsMethodMocked_whenCheckifEqualsInvoked_ThenReturnSecondArgument_UnitTest() {
        List<Book> bookLists=new ArrayList<Book>();
        bookLists.add( new Book(1L, "The Stranger", "Albert Camus", 456));
        bookLists.add( new Book(3L, "Romeo and Juliet", "William Shakespeare", 200));
        bookLists.add(  new Book(2L, "Animal Farm", "George Orwell", 300));
        Mockito.when(bookRepository.getList(Mockito.any(Book.class), Mockito.any(Book.class),
                Mockito.any(Book.class))).thenReturn(bookLists);
        Book[] listOfBooks = bookService.getList(bookLists.get(0), bookLists.get(1), bookLists.get(2)).toArray(new Book[0]);
        Assert.assertEquals(3, listOfBooks[0].getAuthor());
    }
}
