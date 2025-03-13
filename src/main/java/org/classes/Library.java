package org.classes;

import java.util.*;

public class Library {
    private final List<Book> bookCollection;

    public Library() {
        this.bookCollection = new ArrayList<>();
    }

    public List<Book> getBookCollection() {
        return bookCollection;
    }
    public void addBook (Book book){
        bookCollection.add(book);
    }
    public Book getBookByPosition (int position){
        Book book = bookCollection.get(position);
        return book;
    }
    public void addBookInPosition (Book book, int position){
        if (!getBookCollection().contains(book)){
            bookCollection.add(position, book);
            Collections.sort(Collections.unmodifiableList(bookCollection));
        }
    }
    public void deleteBook (String title){
        for (Book book : bookCollection) {
            if(book.getTitle().equalsIgnoreCase(title)){
                bookCollection.remove(book);
            }
        }

    }
}

