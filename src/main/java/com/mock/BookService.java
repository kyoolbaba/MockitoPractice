package com.mock;

import java.util.List;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getByBookId(Long id) {
        return bookRepository.getByBookId(id);
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getList(Book book1, Book book2, Book book3) {
        return bookRepository.getList(book1, book2, book3);
    }
}
