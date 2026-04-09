import java.util.ArrayList;

public class Main {
    // Library Management System (OOP Basics)
    public static void main (String[] args) {
        var user = new User("Titya");
        var library = new Library();

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("KamSnea", "Sinet", false));
        books.add(new Book("KomNotHetSnea", "Sopha", false));
        books.add(new Book("OunJeaJiVitBong", "KornNiTha", false));
        books.add(new Book("MeanTeSneaPit", "Thida", false));
        library.addBooks(books);

        library.borrowBook(0);
        library.showBooks();


    }
}
