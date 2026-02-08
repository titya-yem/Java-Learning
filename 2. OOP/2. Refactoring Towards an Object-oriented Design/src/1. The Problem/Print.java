import java.util.Scanner;

public class Print {
    private static Scanner scanner = new Scanner(System.in);

    // readNumber is method overloading
    public static double readNumber(String prompt, double min, double max) {
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

    public static double readNumber(String prompt) {
        return scanner.nextDouble();
    }
}
