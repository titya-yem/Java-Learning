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

        System.out.print("Principal: ");
        final int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        final float rate = scanner.nextFloat();

        System.out.print("Peroid (Years): ");
        final int period = scanner.nextInt();

        scanner.close();

        double monthlyRate = rate / 12 / 100; // rate / 12 months / 100 to make it into percentage
        int monthlyPayment = period * 12; // total year * 12 months

        double compoundInterest = Math.pow(1 + monthlyRate, monthlyPayment);

        double mortgage = principal * (monthlyRate * compoundInterest) / (compoundInterest - 1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Mortgage: " + currency.format(mortgage));
    }
}
