import generics.GenericList;
import generics.Instructor;
import generics.User;
import generics.Utils;

public static void main (String[] args) {
//    User user = new Instructor(10);
//    Utils.printUser(new  Instructor(10));

//    var users = new GenericList<Instructor>(); will get error
    var users = new GenericList<User>();
    Utils.printUsers(users);
}