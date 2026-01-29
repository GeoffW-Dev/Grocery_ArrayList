import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public int getTotalPages() {
        int total = 0;
        for(Book b : books) {
            total += b.getPages();
        }
        return total;
    }
}
