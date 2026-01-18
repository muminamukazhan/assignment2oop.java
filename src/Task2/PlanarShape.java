package Task2;

import Task1.Shape;

public abstract class PlanarShape extends Shape {
    private double x;
    private double y;

    public PlanarShape() {
        super();
        this.x = 0;
        this.y = 0;
    }

    public PlanarShape(String color, boolean filled, double x, double y) {
        super(color, filled);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String getType() {
        return "PlanarShape";
    }

    @Override
    public String toString() {
        return super.toString() + ", x=" + x + ", y=" + y;
    }
}
