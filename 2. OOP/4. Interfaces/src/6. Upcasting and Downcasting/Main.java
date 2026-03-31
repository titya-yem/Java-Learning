public class Main {
    public static void main(String[] args) {
        // Upcasting = casting an object to one of its super types
        // Downcasting = casting an object to one of its sub types
        var control = new UIControl(true);
        var textBox = new TextBox();

        show(control);
    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Lamdouy");
        }
        System.out.println(control);
    }
}
