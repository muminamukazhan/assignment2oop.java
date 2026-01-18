import Task2.Circle;
import Task2.PlanarShape;
import Task2.Rectangle;

import java.util.*;

public class TestTask2 {
    public static void main(String[] args) {
        ArrayList<PlanarShape> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            if (r.nextBoolean()) {
                list.add(new Circle("Blue", true, r.nextInt(10), r.nextInt(10), r.nextDouble() * 5));
            } else {
                list.add(new Rectangle("Red", false, r.nextInt(10), r.nextInt(10), 2, 3));
            }
        }

        PlanarShape maxP = Collections.max(list, Comparator.comparingDouble(PlanarShape::getPerimeter));
        PlanarShape minP = Collections.min(list, Comparator.comparingDouble(PlanarShape::getPerimeter));

        System.out.println("Max perimeter: " + maxP.getPerimeter());
        System.out.println("Min perimeter: " + minP.getPerimeter());

        list.sort(Comparator.comparingDouble(PlanarShape::distanceFromOrigin));
        System.out.println("Sorted by distance from origin:");
        for (PlanarShape p : list) {
            System.out.println(p.distanceFromOrigin());
        }
    }
}

