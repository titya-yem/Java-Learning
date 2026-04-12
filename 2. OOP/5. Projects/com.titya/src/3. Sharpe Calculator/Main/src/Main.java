import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        var circle = new  Circle(10, 10);
        var rectangle = new  Rectangle(10, 20);
        var triangle = new  Triangle(10, 30);

        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();
    }
}
