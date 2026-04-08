public class Book {
    private int id = 0;
    private String title;
    private String author;
    private boolean isBorrowed = false;

    public Book (String title, String author, boolean isBorrowed) {
        this.id++;
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    public void showBook () {
        System.out.println("id: " + this.id);
        System.out.println("title: " + this.title);
        System.out.println("author: " + this.author);
        System.out.println("isBorrowed: " +  this.isBorrowed);
    }
}
