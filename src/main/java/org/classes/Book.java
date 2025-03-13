package org.classes;


public class Book implements Comparable<Book>{
    private String title;

    public Book(String name) {
        setTitle(name);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book other) {
        boolean result;
        result = other.getTitle().equalsIgnoreCase(getTitle());
        return result;
    }
}
