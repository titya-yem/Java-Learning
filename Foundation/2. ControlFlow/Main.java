import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTH_OF_THE_YEAR = 12;
        final byte PERCENT = 100;

        int principal;
        float monthlyInterest;
        int numberOfPayments;

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
            float interestRate = scanner.nextFloat();
            if (interestRate >= 1 && interestRate <= 30) {
                monthlyInterest = interestRate / MONTH_OF_THE_YEAR / PERCENT;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte period = scanner.nextByte();
            if (period >= 1 && period <= 30) {
                numberOfPayments = period * MONTH_OF_THE_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }

        double pow = Math.pow(1 + monthlyInterest, numberOfPayments);
        double mortgage = principal * (monthlyInterest * pow) / (pow - 1);

        String currency = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + currency);
    }
}