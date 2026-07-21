import exceptions.ExceptionDemo;

public static void main (String[] args) {
    try {
        ExceptionDemo.show();
    } catch (Throwable e) {
        System.out.println("Unexpected error occurred");
    }
}