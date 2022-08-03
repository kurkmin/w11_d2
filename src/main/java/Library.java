import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;


    public Library(int capacity) {
        this.capacity = capacity;
        stock = new ArrayList<>();
    }

    public void addBook(Book book) {
        stock.add(book);
    }

    public int countBooks() {
        return stock.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean canAddBook() {
        return countBooks() < capacity;
    }
}
