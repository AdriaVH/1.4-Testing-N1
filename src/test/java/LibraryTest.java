import org.classes.Book;
import org.classes.Library;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
   /* Verifiquen que la llista de llibres no és nul·la després de crear un nou objecte.
    Confirmen que la llista té una mida esperada després d'inserir diversos llibres.
    Asseguren que la llista conté un llibre específic en la seva posició correcta.
    Verifiquen que no hi ha títols de llibres duplicats a la llista.
    Comproven que es pot recuperar el títol d'un llibre donada una posició específica.
    Asseguren que afegir un llibre modifica correctament la llista.
    Confirmen que eliminar un llibre disminueix la mida de la llista.
    Verifiquen que la llista roman ordenada alfabèticament després d'afegir o eliminar un llibre.*/

    @Test
    public void testNotNull (){
        Library libraryTest = new Library();

        assertNotNull(libraryTest.getBookCollection(),"ArrayList should not be null");

        int expected = 5;
        for (int i = 0; i < expected; i++){
            libraryTest.addBook(new Book (i + ""));
        }

        assertEquals(expected,libraryTest.getBookCollection().size(), "Number should be the same");
        Book bookTest3 = new Book("memorable book");
        libraryTest.addBookInPosition(bookTest3, 3);
        assertEquals(libraryTest.getBookByPosition(3), bookTest3, "Object Book should be the same one");

        //check for duplicates

        assertEquals("memorable book",libraryTest.getBookByPosition(3).getTitle(), "Title should be the same");
    }
}
