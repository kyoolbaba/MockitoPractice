package com.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookRepository {
    public Book getByBookId(Long bookId) {
        return new Book(bookId, "To Kill a Mocking Bird", "Harper Lee", 256);
    }

    public Book save(Book book) {
        return new Book(book.getBookId(), book.getTitle(), book.getAuthor(), book.getNumberOfPages());
    }

    public List<Book> getList(Book bookOne, Book bookTwo, Book bookThree) {
       // List<Book> selection = new ArrayList<>();
        return null;
    }
}