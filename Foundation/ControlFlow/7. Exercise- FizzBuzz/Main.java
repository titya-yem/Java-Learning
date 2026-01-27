import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // if divisible by 3 = Buzz, by 5 = Fizz, 
        // if both = FizzBuzz otherwise return number 

        System.out.print("Number: ");
        int number = scanner.nextInt();

        // 5 % 5 will return 0 so if 5 % 5 == 0
        // so if number(5) % 5 == 0 will return true

        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}

// 3 Buzz / 3
// 5 Fizz / 5
// 10 Fizz / 10
// 15 FizzBuzz
// 2 FizzBuzz / 2
