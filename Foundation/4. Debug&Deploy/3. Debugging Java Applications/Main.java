
public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        printNumber(4);
        System.out.println("Finished");
    }

    // it should print 1 2 3 4 not 0 2
    public static void printNumber(int limit) {
        for (int i = 0; i < limit; i += 2) // bug here
            System.out.println(i);
    }
}