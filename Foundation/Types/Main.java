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
        double time;
        final double total;

        System.out.print("Pricipal: ");
        final int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float rate = scanner.nextFloat();

        System.out.print("Peroid (Years): ");
        final byte period = scanner.nextByte();

        double monthlyRate = rate / 100 / 12;
        int numberOfPayments = period * 12;

        double power = Math.pow(1 + monthlyRate, numberOfPayments);

        double mortgage = principal * (monthlyRate * power) / (power - 1);
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
