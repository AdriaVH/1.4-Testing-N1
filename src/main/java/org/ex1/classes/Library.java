package org.ex1.classes;

import java.util.*;

public class Library {
    private final List<Book> bookCollection;

    public Library() {
        this.bookCollection = new ArrayList<>();
    }

    public List<Book> getBookCollection() {
        return new ArrayList<Book>(bookCollection);
    }

    public void addBook(Book book) {
        if (!bookCollection.contains(book)) {
            bookCollection.add(book);
            Collections.sort(bookCollection);
        }
    }

    public Book getBookByPosition(int position) {
        Book book = null;
        if (position >= 0 && position < bookCollection.size()) {
            book = bookCollection.get(position);
        }
        return book;
    }

    public void addBookInPosition(Book book, int position) {
        if (!bookCollection.contains(book) && position >= 0 && position <= bookCollection.size()) {
            bookCollection.add(position, book);
            Collections.sort(bookCollection);
        }
    }

    public void deleteBook(String title) {
        bookCollection.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        Collections.sort(bookCollection);
    }
}