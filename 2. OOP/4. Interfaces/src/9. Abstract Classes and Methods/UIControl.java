// abstact here will tell that in UIControl[] cannot contains itself
public abstract class UIControl {
    private boolean isEnabled = true;

    // public UIControl(boolean isEnabled) {
    // this.isEnabled = isEnabled;
    // }

    // this will force the child classes to use render method or error
    public abstract void render();

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
