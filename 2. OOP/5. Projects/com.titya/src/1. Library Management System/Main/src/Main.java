public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        User user = new User("Titya");

        library.addBook(new Book("KamSnea", "Sinet"));
        library.addBook(new Book("KomNotHetSnea", "Sopha"));
        library.addBook(new Book("OunJeaJiVitBong", "KornNiTha"));

        library.showBooks();

        System.out.println("\n--- Borrowing ---");
        library.borrowBook(user, 1);

        System.out.println("\n--- After Borrow ---");
        library.showBooks();

        user.showBorrowedBooks();

        System.out.println("\n--- Returning ---");
        library.returnBook(user, 1);

        System.out.println("\n--- Final State ---");
        library.showBooks();
        user.showBorrowedBooks();
    }
}