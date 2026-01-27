
public class Main {
    public static void main(String[] args) {
        int income = 120_000;
        boolean hasHighIncome;

        if (income > 100_000)
            hasHighIncome = true;
        else
            hasHighIncome = false;

        // better way it will shows boolean result
        boolean hasHighIncome2 = (income > 100_000);
    }
}