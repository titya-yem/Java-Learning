import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                // if true wiil go back to loop (run again)
                continue;
            if (input.equals("quit"))
                // if true will terminate or stop loop
                break;
            System.out.println(input);
        }
    }
}