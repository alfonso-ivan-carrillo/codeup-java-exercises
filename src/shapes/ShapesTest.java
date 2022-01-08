package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle  box1 = new Rectangle(4,5);
        System.out.println(Rectangle.getPerimeter(box1.length, box1.width));
        System.out.println(Rectangle.getArea(box1.length, box1.width));

        Rectangle box2 = new Square(5);
        System.out.println(((Square) box2).side);
        Square.getArea(((Square) box2).side);
        Square.getPerimeter(((Square) box2).side);




    }
}
