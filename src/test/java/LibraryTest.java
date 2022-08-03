import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1, book2;

    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("Hello World", "Sumin Oh", "non-fiction");
        book2 = new Book("Codeclan", "Cat", "fiction");
    }


    @Test
    public void checkNumBooks() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(true, library.canAddBook());
    }

    @Test
    public void cannotAddBook() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(false, library.canAddBook());
    }
}
