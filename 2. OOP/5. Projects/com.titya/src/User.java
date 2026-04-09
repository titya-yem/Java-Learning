public class User {
    private String userName = "";

    public User(String userName) {
        this.userName = userName;
    }

    private void showUser () {
        if (userName.isEmpty())
            System.out.println("user is not exist");

        System.out.println("userName: " + this.userName);
    }
}
