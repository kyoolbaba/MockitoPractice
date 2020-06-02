package com.mock;

public class Book {

        private Long bookId;
        private String title;
        private String author;
        private int numberOfPages;

        public Book(Long bookId, String title, String author, int numberOfPages) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.numberOfPages = numberOfPages;
        }

        public Long getBookId() {
            return bookId;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getNumberOfPages() {
            return numberOfPages;
        }

        // constructors, getters and setters


    }