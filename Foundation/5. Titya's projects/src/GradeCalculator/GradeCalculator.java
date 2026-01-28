package GradeCalculator;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte TOTAL_SUBJECTS = 3;

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        // Create array using old way to specific the size of array
        float[] totalScore = new float[TOTAL_SUBJECTS];

        System.out.println("=============================");
        System.out.println("|    Fill in your scores    |");
        System.out.println("=============================\n");
        System.out.print("First subject: ");
        totalScore[0] = scanner.nextFloat();

        System.out.print("Second subject: ");
        totalScore[1] = scanner.nextFloat();

        System.out.print("Third subject: ");
        totalScore[2] = scanner.nextFloat();


        float calculatedScore = 0F;
        // Using forEach loop to extracts array
        for (float scores : totalScore) {
            calculatedScore += scores / TOTAL_SUBJECTS;
        }

        System.out.println("Your average score is: " + Math.ceil(calculatedScore * 100) / 100);
        if (calculatedScore >= 90)
            System.out.println("Congrats " + name + ", you've got A+ ");
        else if (calculatedScore >= 80)
            System.out.println("Congrats " + name + ", you've got B+ ");
        else if (calculatedScore >= 70)
            System.out.println("Wow " + name + ", you've got C+ ");
        else if (calculatedScore >= 60)
            System.out.println("Keep it up " + name + ", you've got D+ ");
        else
            System.out.println("Sorry " + name + ", you've got F");
    }
}
