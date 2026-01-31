
public class Main {
    public static void main(String[] args) {
        String message = "Lamdouy" + " :)";

        // all of String methods return new string (immutable)
        message.endsWith(":)"); // boolean
        message.startsWith("L"); // boolean
        message.length(); // number
        message.indexOf("L"); // return index or -1 (not exits)
        message.replace(":)", ":3");
        message.toLowerCase();
        message.toUpperCase();
        message.trim();

        System.out.println(message);
    }
}