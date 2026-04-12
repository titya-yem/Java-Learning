public class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public void calculateArea() {
        System.out.println("Rectangle");
        area = width * height;
        System.out.println("Area of rectangle: " + area);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Rectangle");
        area = (width * height) * 2;
        System.out.println("Perimeter of rectangle: " + area);
    }
}
