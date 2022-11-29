import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before () {
        book = new Book("The Silmarillion", "J.R.R. Tolkien", "Epic Fantasy");
    }

    @Test
    public void hasTitle() {
        assertEquals("The Silmarillion", book.getTitle());
    }


}
