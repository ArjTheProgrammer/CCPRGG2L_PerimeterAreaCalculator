public class Trapezoid extends Shape {

    private final double base1;
    private final double base2;
    private final double height;

    public Trapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double calculateArea() {
        return (double) Math.round((((base1 + base2) * height) / 2) * 100) / 100;
    }
}