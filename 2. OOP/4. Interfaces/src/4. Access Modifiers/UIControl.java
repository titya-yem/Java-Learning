public class UIControl {
    // if we use private it can only use in its class or sub (child) class only
    // but if using protected it can be use inside the directory (folder)
    // so it means that every files (classes) inside the same folder
    // can be access to isEnabled field
    // boolean isEnabled = true, example of non access modifiers class

    // NOTE: we can use it in difference class in difference packages (folder)
    // if it is sub (child) classes
    // private boolean isEnabled = true
    protected boolean isEnabled = true; // change from private to protected

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UI Control");
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
