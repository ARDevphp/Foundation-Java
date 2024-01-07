public class Main2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,8);
        Triangle triangle = new Triangle(4,6,8);
        Circle circle = new Circle(6);
        rectangle.getPerimeter();
        rectangle.getSurface();
        triangle.getPerimeter();
        triangle.getSurface();
        circle.getCircleArea();
        circle.getDiameter();

    }
}
abstract class Shape {
    abstract double getSurface();
    abstract double getPerimeter();
}
abstract class OnlyCircle{
    abstract double getCircleArea();
    abstract double getDiameter();
}
class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double getSurface() {
        return width+height;
    }

    @Override
    double getPerimeter() {
        return (height+width)*2;
    }
}
class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getSurface() {
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
class Circle extends OnlyCircle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getCircleArea() {
        return 3.14*(radius*radius);
    }

    @Override
    double getDiameter() {
        return radius*2;
    }
}
