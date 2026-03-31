// if we use final keyword here we cannot let any class inherit it
// mostly we don't use it because we cannot get a lot from OOP

// but if we so specific and so sure that the assumption in that implementation
// especially about changing the state we can use final
public final class CheckBox extends UIControl {
    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }
}

// public class MyCheckBox extends CheckBox {}