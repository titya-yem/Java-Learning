import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("📚 Library Books:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + ": " + books.get(i));
        }
    }

    public void borrowBook(User user, int index) {
        if (index < 0 || index >= books.size()) {
            System.out.println("❌ Invalid index");
            return;
        }

        Book book = books.get(index);

        if (book.isBorrowed()) {
            System.out.println("❌ Book already borrowed");
            return;
        }

        book.setBorrowed(true);
        user.borrowBook(book);

        System.out.println("✅ " + user.getUserName() + " borrowed: " + book.getTitle());
    }

    public void returnBook(User user, int index) {
        if (index < 0 || index >= books.size()) {
            System.out.println("❌ Invalid index");
            return;
        }

        Book book = books.get(index);

        if (!book.isBorrowed()) {
            System.out.println("❌ Book is not borrowed");
            return;
        }

        book.setBorrowed(false);
        user.returnBook(book);

        System.out.println("✅ " + user.getUserName() + " returned: " + book.getTitle());
    }
}