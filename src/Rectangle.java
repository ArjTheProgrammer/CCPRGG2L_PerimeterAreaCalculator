public class Rectangle extends Shape {

    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return Math.round( length * width);
    }

    public double calculatePerimeter(){
        return Math.round( 2*length + 2*width);
    }
}
