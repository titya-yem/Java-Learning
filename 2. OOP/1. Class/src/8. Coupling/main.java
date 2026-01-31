
public class main {
    public static void main(String[] args) {
        // Reduce coupling (Browser class)
        // findIpAddress and sendHttpRequest are details so make them private

        var brower = new Browser();
        brower.navigate(null);
    }
}