public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book (String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public boolean isBorrowed () {
        return isBorrowed;
    }

    public void setBorrowed (boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getTitle () {
        return title;
    }

    @Override
    public String toString () {
        return "Title: " + title +
                ", Author: " + author +
                ", Borrowed: " + (isBorrowed ? "Borrowed" : "Available");
    }
}
