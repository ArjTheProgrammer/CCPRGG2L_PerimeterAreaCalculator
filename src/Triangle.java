public class Triangle extends Shape{
    private double base;
    private double height;
    private double sideA;
    private double sideB;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    Triangle(double sideA, double sideB, double base){
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculateArea(){
        return(double) Math.round(((base*height)/2)*100)/100;
    }

    public double calculatePerimeter(){
        return(double) Math.round((sideA+sideB+base)*100.0)/100;
    }
}
