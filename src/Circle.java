public class Circle {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.round(Math.PI * radius * radius) ;
    }

    public double calculatePerimeter() {
        return Math.round( 2 * Math.PI * radius);
    }
}
