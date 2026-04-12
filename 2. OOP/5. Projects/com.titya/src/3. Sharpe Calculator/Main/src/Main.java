import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(10));
        shapes.add(new Rectangle(5, 5));
        shapes.add(new Triangle(10, 5, 6, 7, 8));

        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            double perimeter = shape.calculatePerimeter();

            System.out.println(shape);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println("------------------------");
        }
    }
}
