package calculator;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("====================");
            System.out.println("|    Calculator    |");
            System.out.println("====================");
            System.out.println("Select options: ");
            System.out.println("1 Addition");
            System.out.println("2 Subtraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");
            System.out.println("5 Exit");
            System.out.print("Select: ");

            byte option = scanner.nextByte();
            if (option <= 0 || option >= 6)
                System.out.println("Please select 1-5 only.");

            // NOTE: I could refactor more in case 5 in operationSystem method but, I don't
            // because I don't wanna declared too many attributes and makes operationSystem
            // messy.
            if (option == 5) {
                System.out.println("Exit calculator");
                System.exit(0);
            }

            System.out.print("Enter First Number: ");
            float firstNumber = scanner.nextFloat();

            System.out.print("Enter Second Number: ");
            float lastNumber = scanner.nextFloat();

            if (firstNumber < 0 || lastNumber < 0) {
                System.out.println("First and Second numbers must be greater than or equal 0.");
                break;
            }

            operationSystem(firstNumber, lastNumber, option);
        }
    }

    public static void operationSystem(float firstNumber, float lastNumber, int option) {
        float result = 0;
        String operation = "";

        switch (option) {
            case 1:
                result = firstNumber + lastNumber;
                operation = "Addition";
                break;

            case 2:
                // NOTE: if using Intelij if input 25 - 22 = -3
                // But if vsCode 25 - 22 = 3 (not logic but behavior of IDE)
                result = firstNumber - lastNumber;
                operation = "Subtraction";
                break;

            case 3:
                result = firstNumber * lastNumber;
                operation = "Multiplication";
                break;

            case 4:
                result = firstNumber / lastNumber;
                operation = "Division";
                break;

            default:
                System.out.println("Please select option 1-5 only.");
        }

        System.out.println("\n========================");
        if (result == (int) result)
            System.out.println(operation + " result: " + (int) result);
        else
            // use Math,ceil((result * 100) / 100) for 2 decimals only (2.22)
            System.out.println(operation + " result: " + Math.ceil(result * 100) / 100);
        System.out.println("========================");

        // clear buffer
        scanner.nextLine();
        System.out.println("Press Enter to continue...");
        scanner.nextLine();

        clearScreen();
    }

    public static void clearScreen() {
        for (int i = 0; i < 50; i++)
            System.out.println();
    }
}