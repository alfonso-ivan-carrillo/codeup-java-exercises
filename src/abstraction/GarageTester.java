package abstraction;

public class GarageTester {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        // Vehicle bike = new Bicycle();  -- will work
        bike.go();
        System.out.println(bike.wheels);
        System.out.println(bike.isCorporeal);

        Vehicle car = new Car();  // will work -
        // Car car = new Vehicle(); -- will not work - can't instantiate from abstract class -> Vehicles();
        car.go();
//        System.out.println(car.wheels);  // because Vehicle was used to instantiate Car - wheels variable is not recognized
                                        // Vehicle does not know what wheels are

        PogoStick pogo = new PogoStick();
        pogo.go();

        MagicBroom broom = new MagicBroom();
        System.out.println(broom.isCorporeal);
    }
}
