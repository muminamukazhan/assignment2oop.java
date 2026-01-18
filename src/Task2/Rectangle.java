package Task2;

public class Rectangle extends PlanarShape {
    private double height;
    private double width;

    public Rectangle() {
        super();
        this.height = 1;
        this.width = 1;
    }

    public Rectangle(String color, boolean filled, double x, double y, double h, double w) {
        super(color, filled, x, y);
        this.height = h;
        this.width = w;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}
