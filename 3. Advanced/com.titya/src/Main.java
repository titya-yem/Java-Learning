import generics.GenericList;
import generics.User;

public static void main (String[] args) {
    var list = new GenericList<Integer>();
    list.add(1);

    var userList = new GenericList<User>();
    userList.add(new User());
}