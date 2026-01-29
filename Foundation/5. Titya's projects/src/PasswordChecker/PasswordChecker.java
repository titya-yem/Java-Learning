package PasswordChecker;

import java.util.Scanner;

public class PasswordChecker {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {

        while (true) {
            System.out.print("Enter your password (8 only): ");
            String password = scanner.nextLine();

            System.out.print("Can you confirm your password?: ");
            String confirmPassword = scanner.nextLine();

            if (password.length() != 8) { // check if password not equal 8 characters
                System.out.println("\nInvalid password, please write only 8 characters.\n");
                exitOption();
            }
            else if (!password.equals(confirmPassword)) { // check if passwords are different
                System.out.println("\nPlease check, your confirm password is incorrect.\n");
                exitOption();
            }
            else
                checkPassword(confirmPassword);
        }
    }

    public static void checkPassword(String confirmPassword) {
        // declared variables to check
        char ch; // use char to loop each character of confirmPassword's string
        boolean captialFlag = false; // use boolean to check if there are any capital character
        boolean lowerCaseFlag = false; // use boolean to check if there are any lower character
        boolean numberFlag = false; // use boolean to check if there are any number
        boolean symboolFlag = false; // use boolean to check if there are any symbool (!@#$%^&*)

        for (byte i = 0; i < confirmPassword.length(); i++) {
            ch = confirmPassword.charAt(i); // charAt(i) = loop confirmPassword each time

            // NOTE: Character is each characters inside confirmPassword
            // use methods to check if yes, change boolean to true
            if (Character.isUpperCase(ch))
                captialFlag = true;
            else if (Character.isLowerCase(ch))
                lowerCaseFlag = true;
            else if (Character.isDigit(ch))
                numberFlag = true;
            else if (!Character.isLetterOrDigit(ch))
                symboolFlag = true;
        }

        if (symboolFlag) // use symbol and number first based on higher order operation
            System.out.println("\nCongrats, your password is strong.");
        else if (numberFlag)
            System.out.println("\nYour password is Okay.");
        else if (captialFlag || lowerCaseFlag)
            System.out.println("\nYour password is weak.");
        else
            System.out.println("\nSorry, we cannot define your password.");

        exitOption();
    }

    public static void exitOption() {
        System.out.println("============================");
        System.out.println("Would you like to continue ?");
        System.out.println("1) Yes \t2) No");
        byte option = scanner.nextByte();
        scanner.nextLine(); // clear buffer
        switch (option) {
            case 1:
                for (byte i = 0; i < 10; i++)
                    System.out.println();
                break;
            case 2:
                System.exit(0);
        }
    }
}
