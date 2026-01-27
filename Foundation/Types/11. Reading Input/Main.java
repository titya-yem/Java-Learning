import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);

        // to get string write like this
        scanner.nextLine();
        scanner.nextLine().trim();

        scanner.nextFloat();
        scanner.nextInt();

        scanner.close();
    }
}