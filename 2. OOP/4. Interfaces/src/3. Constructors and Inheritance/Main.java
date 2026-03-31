public class Main {
    public static void main(String[] args) {
        // Constructor are called when we create an instance of a class
        var textBox = new TextBox();
        // now we runned and see first it runs UIControll constructor then TextBox
        // because UIControl is super (parent) class of TextBox, so it means that
        // even if we create TextBox object here but it call the super class first

    }
}
