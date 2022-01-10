package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return ((2 * length) + (2 * width));
    }

    public double getArea() {
        return length * width;
    }


    // class using abstract method from Quadrilateral - use VOID
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public  double getArea(){
//        return this.length * this.width;
//    }
//
//    public  double getPerimeter(){
//        return ((2 * this.length) + (2 * this.width));
//    }




}
