import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte MONTH_OF_THE_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        int principal = 0;
        float interestRate = 0;
        byte period = 0;

        principal = (int) readNumber("Principal: ", 1_000, 1_000_100);
        interestRate = (float) readNumber("Annual Interest Rate: ", 1, 30);
        period = (byte) readNumber("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, interestRate, period);

        String currency = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.print("Monthly Payment: " + currency + "\n");

        System.out.println("PAYMENT SCHEDULE");
        System.out.println("--------------");
        for (short month = 1; month <= period * MONTH_OF_THE_YEAR; month++) {
            double balance = calculateBalance(principal, interestRate, period, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;

        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;

            System.out.println("Enter a number between " + min + " and " + max);
        }
        return value;
    }

    public static double calculateBalance(int principal, float interestRate, byte period, short numberOfPaymentsMade) {
        short numberOfPayments = (short) (period * MONTH_OF_THE_YEAR);
        float monthlyInterest = interestRate / MONTH_OF_THE_YEAR / PERCENT;

        double powTotalPayment = Math.pow(1 + monthlyInterest, numberOfPayments);
        double powPaymentMade = Math.pow(1 + monthlyInterest, numberOfPaymentsMade);

        double balance = principal * (powTotalPayment - powPaymentMade) / (powTotalPayment - 1);
        return balance;
    }

    public static double calculateMortgage(int principal, float interestRate, byte period) {
        // casting all to short
        short numberOfPayments = (short) (period * MONTH_OF_THE_YEAR);

        float monthlyInterest = interestRate / MONTH_OF_THE_YEAR / PERCENT;
        double powTotalPayment = Math.pow(1 + monthlyInterest, numberOfPayments);

        return principal * (monthlyInterest * powTotalPayment) / (powTotalPayment - 1);
    }
}