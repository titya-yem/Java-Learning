
public class Main {
    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;

        double a = 1.1;
        int b = (int) a + 2;

        String c = "1";
        // Float.parseFloat(c); we have all types just change names
        int d = Integer.parseInt(c) + 2;
    }
}