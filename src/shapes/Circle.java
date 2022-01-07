package shapes;

public class Circle {

    private double radius;
    public double area;
    public double circumference;

    // FINAL keyword
    // is the same as a const in javascript, a final variable cannot be reassigned

    public Circle(double radius, double area, double circumference) {
        this.radius = radius;
        this.area = area;
        this.circumference = circumference;
    }

    public Circle(){
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * (Math.pow(radius, 2));
    }

    public double getCircumference(){
        return (2 * Math.PI * radius);
    }
    public static void main(String[] args){

    }
}
