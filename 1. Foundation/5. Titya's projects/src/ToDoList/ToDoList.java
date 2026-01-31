package ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    static Scanner scanner = new Scanner((System.in));
    public static void main(String[] args) {
        // ArrayList is to store lists easy to access with methods than normal array
        ArrayList<String> list = new ArrayList<String>();

        while (true) {
            System.out.println("====================");
            System.out.println("|    To Do List    |");
            System.out.println("====================");
            System.out.println("Please Select your option: ");
            System.out.println("1) Add task ");
            System.out.println("2) View task ");
            System.out.println("3) Exit ");

            System.out.print("Enter your option: ");
            byte option = scanner.nextByte();
            scanner.nextLine();

            if (option < 1 || option > 3)
                System.out.println("Invalid option, please choose only 1-3.");

            printLists(list, option);
        }
    }

    public static void printLists(ArrayList<String> list, byte option) {
        switch (option) {
            case 1:
                System.out.print("Add task: ");
                String task = scanner.nextLine();

                list.add(task);
                clearScreen();
                break;
            case 2:
                if (list.isEmpty()) {
                    System.out.println("\n===================");
                    System.out.println("|  List is empty  |");
                    System.out.println("===================");
                    clearScreen();
                }
                else {
                    System.out.println("\n===================");
                    System.out.println("|      Lists      |");
                    System.out.println("===================");
                    for (String listItems : list)
                        System.out.println(listItems);
                    System.out.println("===================");
                }
                clearScreen();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Please enter a valid option (1-3).");
        }
    }

    public static void clearScreen() {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
        for (byte i = 0; i < 20; i++) {
            System.out.println();
        }
    }
}
