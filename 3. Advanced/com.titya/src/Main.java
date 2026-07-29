import generics.GenericList;
import generics.User;
import generics.Utils;

public static void main (String[] args) {
    var max = Utils.max(new User(10),new User(20));
    System.out.println(max);
}