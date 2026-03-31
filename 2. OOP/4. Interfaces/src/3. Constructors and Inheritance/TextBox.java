public class TextBox extends UIControl {
    private String text = "";

    // if the super (parent) object has constructor and parameter as UIControl
    // we must explicit it and use super (syntax), must called it first line
    // and give augurment follow by UIControl's parameter
    public TextBox() {
        super(true);
        System.out.println("Text Box");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}