
public class main {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        var textbox2 = textBox1;

        // All primitive types will store on memory on the (Stack)
        // All reference & object types will store on memory on the (Heap)
        // reference types and object can be change if the reference changes

        // example here
        textbox2.setText("Lamdouy");
        System.out.println(textBox1.text);

    }
}