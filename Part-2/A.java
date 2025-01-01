// Define the Shape interface
interface Shape {
    double getArea(); // Abstract method to calculate area
}

// Implement the Shape interface in the Rectangle class
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor to initialize Rectangle dimensions
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of getArea method for Rectangle
    @Override
    public double getArea() {
        return length * width;
    }
}

// Implement the Shape interface in the Circle class
class Circle implements Shape {
    private double radius;

    // Constructor to initialize Circle radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of getArea method for Circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Area = πr²
    }
}

// Implement the Shape interface in the Triangle class
class Triangle implements Shape {
    private double base;
    private double height;

    // Constructor to initialize Triangle dimensions
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementation of getArea method for Triangle
    @Override
    public double getArea() {
        return 0.5 * base * height; // Area = 1/2 * base * height
    }
}

// Main class to test the implementations
public class A {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        System.out.println("Area of Rectangle: " + rectangle.getArea());

        Shape circle = new Circle(4);
        System.out.println("Area of Circle: " + circle.getArea());

        Shape triangle = new Triangle(6, 4);
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}
