package BirdHaven;

public class Duck extends Bird{
    // extends Bird - Duck inherent the properties of Bird Class

    public Duck(){

    }
    public Duck(String name, boolean canFly){
        super(name, canFly);  // super constuctor is entered first, above other constuctors and setters/getters

                                // don't want to use a setter method in a constuctor, it will cause an infinite loop
                                // public void setName(String name){
                                //      this.setName(name);
                                //  }
    }

    // This over-rides the Bird Class (superclass)
    public void makeNoise(){
        super.makeNoise();
        System.out.print("Quack Quack \n");
    }

}
