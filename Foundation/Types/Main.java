import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // *Mortgage calculator*
        // Pricipal: 100000
        // Annual Interest Rate: 3.92
        // Period (year): 30
        // Mortgage: $472.81

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pricipal: ");
        final int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float rate = scanner.nextFloat();

        System.out.print("Peroid (Years): ");
        final byte period = scanner.nextByte();

        scanner.close();

        double monthlyRate = rate / 100 / 12;
        int monthlyPayment = period * 12;

        double compoundInterest = Math.pow(1 + monthlyRate, monthlyPayment);

        double mortgage = principal * (monthlyRate * compoundInterest) / (compoundInterest - 1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Mortgage: " + currency.format(mortgage));
    }
}
