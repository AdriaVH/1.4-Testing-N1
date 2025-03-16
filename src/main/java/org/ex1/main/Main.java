package org.ex1.main;

import org.ex1.classes.Library;
import org.ex1.classes.Book;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Harry Potter and the Deadly Hollows: part 1");
        Book book2 = new Book("Best catch frases ever");
        Book book3 = new Book("Finding Nemo");
        Book book4 = new Book("Artemis Fowl");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println("\nBooks in Library after adding:");
        library.getBookCollection().forEach(book -> System.out.println(book.getTitle()));

        System.out.println("\nBook at position 1: " + library.getBookByPosition(1).getTitle());

        Book book5 = new Book("Moby Dick");
        library.addBookInPosition(book5, 2);

        library.deleteBook("Finding Nemo");

        System.out.println("\nBooks in Library after deleting 'Finding Nemo':");
        library.getBookCollection().forEach(book -> System.out.println(book.getTitle()));
    }
}
