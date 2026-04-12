public class Triangle extends Shape {
    public Triangle(double height, double width) {
        super(height, width);
    }

    @Override
    public void calculateArea() {
        System.out.println("Triangle");
        area = (width * height) / 2;
        System.out.println("Area of triangle: " + area);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Triangle");
        area = (width * height) / 2;
        System.out.println("Perimeter of triangle: " + area);
    }
}
