
public class Main {
    public static void main(String[] args) {
        String message = greetUser("Titya", "Yem");
        String message2 = greetUser("Pisey", "Thida");
    }

    // declared to method in Main class object
    public static String greetUser(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }

    // public static void greetUser(String firstName) {
    // System.out.println("Hello " + firstName);
    // }
}