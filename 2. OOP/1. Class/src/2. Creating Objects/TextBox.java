
public class TextBox {
    public String text = ""; // Field

    public void setText(String text) {
        this.text = text; // assign text (Field) = text of parameter
    }

    public void clear() {
        text = ""; // text here refers to text (Field)
    }
}
