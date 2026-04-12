public class Circle extends Shape { ;
    private double radius;

    public Circle(double height, double width) {
        super(height, width);
    }

    @Override
    public void calculateArea() {
        System.out.println("Circle");
        radius = width / 2;
        area = radius * Math.pow(radius, 2);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Circle");
        radius = width / 2;
        area = radius * width;
    }
}
