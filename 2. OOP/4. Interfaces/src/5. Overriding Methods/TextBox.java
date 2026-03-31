public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
        super(true);
        System.out.println("Text Box");
    }

    // anotation is a label that we attach to a class member, with it
    // we can give extra information to the Java compiler
    @Override // we overidding toString method declared in the Object class
    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}