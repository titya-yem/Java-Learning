
public class main {
    public static void main(String[] args) {
        // NOTE: The way to call and use TextBox object (2 ways)
        // TextBox textBox1 = new TextBox(); // redundant of (TextBox)

        var textBox1 = new TextBox(); // new way, it will detect the types on the right side
        System.out.println(textBox1.text); // text (Field) = null
        textBox1.setText("Box 1"); // the way to use and assign Field

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2);

    }
}