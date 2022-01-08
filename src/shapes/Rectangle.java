package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length){
        this.length = length;
    }

    public Rectangle(){
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public static int getArea(int length, int width){
        return length * width;
    }

    public static int getPerimeter(int length, int width){
        return ((2 * length) + (2 * width));
    }
}
