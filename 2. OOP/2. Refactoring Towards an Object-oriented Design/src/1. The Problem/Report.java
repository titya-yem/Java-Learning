import java.text.NumberFormat;

public class Report {
    public static void printMortgage(double mortgage) {
        String currency = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.print("Monthly Payment: " + currency + "\n");
    }

    public static void printPaymentSchedule(int principal, float interestRate, byte period) {
        var calculator = new Calculate(principal, interestRate, period);

        System.out.println("PAYMENT SCHEDULE");
        System.out.println("--------------");
        for (short month = 1; month <= period * Main.MONTH_OF_THE_YEAR; month++) {
            double balance = calculator.calculateBalance(principal, interestRate, period, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
