import java.util.Date;

class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Created on " + dateCreated + "\nColor: " + color + " and filled: " + filled;
    }
}

class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("Circle radius: " + radius);
    }
}

class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

public class TestGeometricObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red", true);
        System.out.println("Circle Details:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println(circle.toString());

        System.out.println();

        Rectangle rectangle = new Rectangle(4.0, 7.0, "Blue", false);
        System.out.println("Rectangle Details:");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println(rectangle.toString());
    }
}
