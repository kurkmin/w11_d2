import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;
    @Before
    public void before() {
        book = new Book("Hello World", "Sumin Oh", "non-fiction");
    }

    @Test
    public void hasTitle() {
        assertEquals("Hello World", book.getTitle());

    }

    @Test
    public void hasAuthor() {
        assertEquals("Sumin Oh", book.getAuthor());

    }

    @Test
    public void hasGenre() {
        assertEquals("non-fiction", book.getGenre());

    }



}
