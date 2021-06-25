package org.sloth;

/**
 * Hello world!
 *
 */
public class App 
{
    static Library ourLibrary;

    public static void main( String... args )
    {
        ourLibrary = establish("Aresiel's Library of Garbage", "Aresiel");
        Book coolBook = new Book("Book Name", "Author", "REALLYLONGISBN");
        ourLibrary.addBook(coolBook);
        ourLibrary.removeBook("Book Name");
    }


    public static Library establish(String name, String owner) {
        return new Library(name, owner);
    }
}
