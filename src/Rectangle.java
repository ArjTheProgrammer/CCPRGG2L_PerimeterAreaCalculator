public class Rectangle extends Shape {

    private final double length;
    private final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return(double) Math.round(( length * width)*100)/100;
    }

    public double calculatePerimeter(){
        return(double) Math.round((2*length + 2*width)*100.0)/100;
    }
}
