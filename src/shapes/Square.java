package shapes;

public class Square extends Quadrilateral{
//    private double side;

    public Square(double side){
        super(side, side);
    }

    /* instructor solution
    * public Square(double side){
    *   this.side = side;
    *   this.length = side;
    *   this.width = side;
    *
    *
    *
    * */

    public void setLength(double length){
       this.setLength(length);
    }
    public void setWidth(double width){
      this.setLength(length);
    }


    public double getPerimeter(){
        return 4 * length;  // had it as this.length
    }
    public double getArea(){
        return Math.pow(length, 2);  // had it as this.length
    }
 //   instructor solutions

//      public Square(double side){
//        super(side, side);
//      }
//
//        public double getArea(){
//           System.out.println("This is a square.");
//           return Math.pow(super.length, 2);
//        }
//
//        public double getPerimeter(){
//            return (2 * super.length) + (2 * super.width);  // could use return 4 * super.length -> in a square lenght and width would be the same
//        }







}
