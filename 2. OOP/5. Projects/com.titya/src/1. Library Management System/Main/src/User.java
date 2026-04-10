import java.util.ArrayList;

public class User {
    private String userName;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String userName) {
        this.userName = userName;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void showBorrowedBooks() {
        System.out.println("📚 " + userName + "'s books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }

    public String getUserName() {
        return userName;
    }
}