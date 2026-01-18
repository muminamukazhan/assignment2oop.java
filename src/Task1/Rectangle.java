package Task1;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle() {
        super("Black", false);
        this.height = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double height, double width, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
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

    @Override
    public String toString() {
        return super.toString() +
                ", Height: " + height +
                ", Width: " + width;
    }
}
