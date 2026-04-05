package com.titya;

public class TextBox extends UIControl { // inheritance from UIControl
    private String text = "";

    // when the parent (UIControl) has constructor and field as parameter
    // we have to use super() and give value based on type of UIControl
    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }
}