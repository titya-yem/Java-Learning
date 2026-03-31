public abstract class UIControl {
    private boolean isEnabled = true;

    // public UIControl(boolean isEnabled) {
    // this.isEnabled = isEnabled;
    // }

    public abstract void render();

    // cannot override this method on the child class
    public final void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
