import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int principal = 0;
        float interestRate = 0;
        byte period = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            interestRate = scanner.nextFloat();
            if (interestRate >= 1 && interestRate <= 30)
                break;

            System.out.println("Enter a value between 1 and 30.");
        }

        while (true) {
            System.out.print("Period (Years): ");
            period = scanner.nextByte();
            if (period >= 1 && period <= 30)
                break;

            System.out.println("Enter a value between 1 and 30.");
        }

        scanner.close();

        double mortgage = calculateMortgage(principal, interestRate, period);

        String currency = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + currency);
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