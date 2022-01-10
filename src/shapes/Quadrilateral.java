package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    // instuctor - to allow side variable in square class
    public Quadrilateral(){
    }

    public double getLength(double length){
        return length;
    }

    public double getWidth(double width){
        return width;
    }

    // should be void with instantiating an abstract method
    public abstract void setLength(double length);
    public abstract void setWidth(double width);

}
