package com.titya;

public class TextBox extends UIControl { // inheritance from UIControl
    private String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }
}