public class Circle extends Shape {

    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return(double) Math.round((Math.PI * radius * radius)*100)/100;
    }

    public double calculatePerimeter() {
        return(double) Math.round((2 * Math.PI * radius)*100)/100;
    }
}
