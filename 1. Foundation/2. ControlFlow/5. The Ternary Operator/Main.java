
public class Main {
    public static void main(String[] args) {
        int income = 120_000;
        String className;

        if (income > 100_000)
            className = "First";
        else
            className = "Economy";

        // better way
        String className2 = income > 100_000 ? "First" : "Economy";
        String className3 = (income > 100_000) ? "First" : "Economy";
    }
}