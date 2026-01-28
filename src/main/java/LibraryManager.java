import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        // creates the library object
        Library library = new Library();

        String title;
        int pages;
        String sentinel = "y";

        while (sentinel.equals("y")) {
            title = scnr.nextLine();
            pages = scnr.nextInt();

            // creates book object
            Book b = new Book(title, pages);
            library.addBook(b);

            sentinel = scnr.next();
        }System.out.println("Books in library:");
        for (book b : library.getBooks()) {
            System.out.println(b.getTitle() + "(" + b.getPages() + " pages)");
        }
        System.out.println("Total pages: " + library.getTotalPages());

    }
}
