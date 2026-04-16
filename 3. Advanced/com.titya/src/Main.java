import generics.GenericList;
import generics.Instructor;
import generics.User;
import generics.Utils;

public class Main {
    public static void main(String[] args) {
        var instructors = new GenericList<Instructor>();
        var users = new GenericList<User>();
        Utils.printUsers(new GenericList<Instructor>());
    }
}
