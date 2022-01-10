package abstraction;

public class MagicBroom extends Vehicle {

    // you can over-ride value of an abstract field
    public boolean isCorporeal = false;

    public void go() {
        System.out.println("Whoosh!");
    }
}
