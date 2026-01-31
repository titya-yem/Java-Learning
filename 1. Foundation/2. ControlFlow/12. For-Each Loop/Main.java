
public class Main {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Mango", "Orange" };

        // Traditional for loop
        // for (int i = fruits.length; i > 0; i--)
        // System.out.println(fruits[i]);

        // forEach loop
        // it can only loop from start to finished
        // it cannot access each item by index
        for (String fruit : fruits)
            System.out.println(fruit);

    }
}