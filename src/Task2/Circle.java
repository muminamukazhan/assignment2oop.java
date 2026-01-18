package Task2;

public class Circle extends PlanarShape {
    private double radius;

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(String color, boolean filled, double x, double y, double radius) {
        super(color, filled, x, y);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }
}
