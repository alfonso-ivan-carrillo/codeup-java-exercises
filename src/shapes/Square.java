package shapes;

public class Square extends Rectangle{
    public int side;

    public Square(int length, int width){
        super(length, width);
        this.length = side;
        this.width = side;
    }

    public Square(int side){
        this.side = side;
        this.length = side;
        this.width = side;
    }

    public static int getPerimeter(int side){
        System.out.println((4 * side));
        return (4 * side);
    }
    public static int getArea(int side){
        System.out.println((int) (Math.pow(side, 2)));
        return (int) (Math.pow(side, 2));
    }





}
