package org.sloth;

import java.util.ArrayList;
import java.util.Date;

public class Library {
    ArrayList<Book> books = new ArrayList<Book>();
    String name;
    String owner;
    Date established; 

    Library(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void removeBook(String title) {
        for(Book b : books) {
            if (b.title.equals(title)){
                books.remove(b);
                break;
            }
        }
    } 

    public void removeBook(Book b) {
        books.remove(b);
    }   
}
