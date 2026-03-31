public class UIControl {
    private boolean isEnabled = true;

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    // we can use the same name as field (difference type of memory)
    public boolean isEnabled() {
        return isEnabled;
    }
}
