import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int principal = 0;
        float interestRate = 0;
        byte period = 0;

        principal = (int) readNumber("Principal: ", 1_000, 1_000_100);
        interestRate = (float) readNumber("Annual Interest Rate: ", 1, 30);
        period = (byte) readNumber("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, interestRate, period);

        String currency = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + currency);
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;

        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max) {
                break;

            }

            scanner.close();
            System.out.println("Enter a number between " + min + " and " + max);
        }
        return value;
    }

    public static double calculateMortgage(
            int principal,
            float interestRate,
            byte period) {

        final byte MONTH_OF_THE_YEAR = 12;
        final byte PERCENT = 100;

        // casting all to short
        short numberOfPayments = (short) (period * MONTH_OF_THE_YEAR);

        float monthlyInterest = interestRate / MONTH_OF_THE_YEAR / PERCENT;
        double pow = Math.pow(1 + monthlyInterest, numberOfPayments);

        return principal * (monthlyInterest * pow) / (pow - 1);
    }
}