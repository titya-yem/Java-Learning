import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Primative types such as Byte, Short, Int, Long
        // Float, Double, Char, Boolean as examples in 1. dir
        // they will allocate memory and release.

        // Here are Reference types are types using with
        // new keyword and it generally included such as
        // Array, String and more it need programmer to allocate
        // memory
        Date now = new Date();
        System.out.println(now);
    }
}