import Task1.*;
import java.util.Random;

public class TestTask1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Shape[] shapes = new Shape[10];

        for (int i = 0; i < shapes.length; i++) {
            int type = rand.nextInt(3);
            if (type == 0) {
                shapes[i] = new Shape("Red", true);
            } else if (type == 1) {
                shapes[i] = new Circle("Blue", true, rand.nextDouble() * 10);
            } else {
                shapes[i] = new Rectangle(
                        rand.nextDouble() * 5,
                        rand.nextDouble() * 5,
                        "Yellow",
                        false
                );
            }
        }

        for (Shape s : shapes) {
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println("Circle area: " + c.getArea());
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("Rectangle perimeter: " + r.getPerimeter());
            } else {
                System.out.println("Shape color: " + s.getColor());
            }
        }
    }
}

