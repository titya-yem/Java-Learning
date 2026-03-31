public class Main {
    public static void main(String[] args) {
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);

        // because we wanna compare 2 objects (Point) so we must make
        // a new method or override the equals method (Object)
        System.out.println(point1.equals(point2));
    }
}
