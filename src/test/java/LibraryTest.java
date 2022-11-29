import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book;
    Library library;

    @Before
    public void setUp() {
        book = new Book("The Silmarillion", "J.R.R Tolkien", "Epic fantasy");
        library = new Library();
    }

    @Test
    public void canGetStockCount() {
        assertEquals(0, library.stockCount());
    }
    @Test
    public void canAddBook() {
        library.addBooktoLibrary();
        assertEquals(1, library.stockCount());
    }

    @Test
    public void libraryCapacityFull () {
        library.addBooktoLibrary();
        library.addBooktoLibrary();
        library.addBooktoLibrary();
        library.addBooktoLibrary();
        library.addBooktoLibrary();
        library.stockFull();
        assertEquals(5, library.stockCount());
    }

    @Test
    public void canAddBookIfStockNotFull() {
        library.addBooktoLibrary();
        library.addBookIfStockNotFull();
        assertEquals(2, library.stockCount());
    }
}
