
public class Main {
    public static void main(String[] args) {
        int role = 1;

        switch (role) {
            case 1:
                System.out.println("You are an admin");
                break;

            case 2:
                System.out.println("You are a moderator");
                break;

            default:
                System.out.println("You are a user");
        }
    }
}