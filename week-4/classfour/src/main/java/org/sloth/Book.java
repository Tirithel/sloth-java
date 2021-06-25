package org.sloth;

public class Book {
    String title;
    String author;
    String ISBN;
    int pageCount;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    Book(String title, String author, String ISBN, int pageCount) {
        this(title, author, ISBN);
        this.pageCount = pageCount;
    }
}
