import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private Book book;

    public void addBooks(ArrayList<Book> books) {
        this.books.addAll(books);
    }

    public void borrowBook(int index) {
        if (index < 0 || index >= books.size())
            System.out.println("Something went wrong");

        this.book = this.books.get(index);
        this.book.setIsBorrowed(true);
    }

    public void returnBook(int index) {
        if (index < 0 || index >= books.size())
            System.out.println("Something went wrong");

        this.book = this.books.get(index);
        this.book.setIsBorrowed(false);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
