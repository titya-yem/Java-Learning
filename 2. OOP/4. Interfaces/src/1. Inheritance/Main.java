public class Main {
    public static void main(String[] args) {
        // inheritance means we can use it as parent class to share everything
        // the same to other classes, example circle, box, and rectangle.
        // They contains height and width the same so we can do that

        var control = new TextBox();
        // now TextBox class can use fields and methods of UIControl class
        control.enable();

        control.disable();
        System.out.println(control.isEnabled());
    }
}
