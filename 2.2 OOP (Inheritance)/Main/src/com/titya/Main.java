package com.titya;

public class Main {
    public static void main(String[] args) {
        UIControl[] controls = {new UIControl(), new TextBox(), new CheckBox() };
        for (var control: controls )
            control.render();
    }
}
