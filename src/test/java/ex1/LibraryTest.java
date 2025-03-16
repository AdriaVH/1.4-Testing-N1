package ex1;

import org.ex1.classes.Book;
import org.ex1.classes.Library;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class LibraryTest {
    private Library library;
    private Book book1, book2, book3;

    @BeforeEach
    void setUp() {
        library = new Library();
        book1 = new Book("Book A");
        book2 = new Book("Book B");
        book3 = new Book("Book C");
    }

    @Test
    void testLibraryIsNotNullAfterCreation() {
        assertNotNull(library.getBookCollection());
    }

    @Test
    void testAddingBooksIncreasesSize() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getBookCollection().size());
    }

    @Test
    void testRetrieveBookByIndex() {
        library.addBook(book1);
        assertEquals(book1, library.getBookByPosition(0));
    }

    @Test
    void testAddingBookAtSpecificPosition() {
        library.addBook(book1);
        library.addBook(book3);
        library.addBookInPosition(book2, 1);
        assertEquals(book2, library.getBookByPosition(1));
    }

    @Test
    void testRemovingBookDecreasesSize() {
        library.addBook(book1);
        library.addBook(book2);
        library.deleteBook("Book A");
        assertEquals(1, library.getBookCollection().size());
    }

    @Test
    void testNoDuplicateBooks() {
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(1, library.getBookCollection().size());
    }

    @Test
    void testLibraryRemainsSorted() {
        library.addBook(book3);
        library.addBook(book1);
        library.addBook(book2);
        List<Book> books = library.getBookCollection();
        assertEquals(List.of(book1, book2, book3), books);
    }
}
