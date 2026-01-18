package Task3;

public class Rational extends Number implements Comparable<Rational> {
    private long numerator;
    private long denominator;

    public Rational(long n, long d) {
        if (d == 0) throw new IllegalArgumentException("Denominator cannot be zero");
        numerator = n;
        denominator = d;
        reduce();
    }

    private void reduce() {
        long gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public Rational add(Rational r) {
        return new Rational(
                numerator * r.denominator + r.numerator * denominator,
                denominator * r.denominator
        );
    }

    public Rational subtract(Rational r) {
        return new Rational(
                numerator * r.denominator - r.numerator * denominator,
                denominator * r.denominator
        );
    }

    public Rational multiply(Rational r) {
        return new Rational(numerator * r.numerator, denominator * r.denominator);
    }

    public Rational divide(Rational r) {
        return new Rational(numerator * r.denominator, denominator * r.numerator);
    }

    @Override
    public int compareTo(Rational o) {
        return Long.compare(numerator * o.denominator, o.numerator * denominator);
    }

    public double doubleValue() {
        return (double) numerator / denominator;
    }

    public float floatValue() {
        return (float) doubleValue();
    }

    public int intValue() {
        return (int) doubleValue();
    }

    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
