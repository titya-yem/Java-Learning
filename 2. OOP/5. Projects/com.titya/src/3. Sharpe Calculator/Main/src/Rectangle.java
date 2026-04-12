public class Rectangle extends Shape {
    @Override
    public void calculateArea() {
        System.out.println("Rectangle");
        area = width * height;
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Rectangle");
        area = (width * height) * 2;
    }
}
