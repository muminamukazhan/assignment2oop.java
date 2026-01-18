import Task3.Rational;
import java.util.*;

public class TestTask3 {
    public static void main(String[] args) {
        Random r = new Random();
        Rational[] arr = new Rational[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Rational(r.nextInt(20) + 1, r.nextInt(20) + 1);
        }

        Arrays.sort(arr);

        Rational sum = new Rational(0, 1);
        Rational product = new Rational(1, 1);

        for (Rational x : arr) {
            sum = sum.add(x);
            product = product.multiply(x);
        }

        Rational min = arr[0];
        Rational max = arr[arr.length - 1];

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + max.subtract(min));
        System.out.println("Division: " + max.divide(min));
    }
}

