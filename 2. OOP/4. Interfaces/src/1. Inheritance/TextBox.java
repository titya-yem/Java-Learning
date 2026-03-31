// to inherit all features we must write (extends "class's name")
public class TextBox extends UIControl {

    private String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}