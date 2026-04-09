public class Book {
    private String title = "";
    private String author = "";
    private boolean isBorrowed = false;

    public Book (String title, String author, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    @Override
    public String toString() {
        return "Title: " + this.title +
                ", Author: " + this.author +
                ", Status: " + (this.isBorrowed ? "Borrowed" : "Available");
    }

    private void showBook () {
        if (this.isBorrowed && this.author.isEmpty() && this.title.isEmpty())
            System.out.println("Book is not exist");

        System.out.println("title: " + this.title);
        System.out.println("author: " + this.author);
        System.out.println("isBorrowed: " + (this.isBorrowed ? "borrowed" : "unborrowed"));
    }
}
