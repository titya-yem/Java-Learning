import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBooks(ArrayList<Book> books) {
        this.books.addAll(books);
    }

    public void borrowBook(int index) {
        Book book = this.books.get(index);

        book.setIsBorrowed(true);
        this.books.remove(index);

        System.out.println("Borrowed Book: " + book);
        System.out.println("-----------------------");
    }

    public void returnBook(Book book) {
        book.setIsBorrowed(false);

        this.books.add(book);
        System.out.println("Borrowed Book: " + book);
        System.out.println("-----------------------");
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
