public abstract class Shape {
    // inheritance
    protected double height;
    protected double width;
    protected double area;

    public Shape(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void calculateArea() {} // Polymorphism
    public void calculatePerimeter() {}
}
