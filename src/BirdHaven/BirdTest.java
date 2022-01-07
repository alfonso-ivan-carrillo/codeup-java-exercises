package BirdHaven;

public class BirdTest {
    public static void main(String[] args) {
//        Bird cardinal = new Bird();
//        cardinal.setName("Cardinal");
//        cardinal.setCanFly(true);
//        cardinal.makeNoise();
//        cardinal.move();
//
//        Duck mallard = new Duck("mallard", true);
////        mallard.setCanFly(true);
////        mallard.setName("mallard");
//        mallard.makeNoise();
//        mallard.move();
//
//        Finch lesserGoldFinch = new Finch();
//        lesserGoldFinch.makeNoise();
//
//        Penguin mombo = new Penguin();
//        mombo.setName("Emperor Penguin");
//        mombo.makeNoise();
//        mombo.move();

        Duck marbleDuck = new Duck("Marble Duck", true);
        System.out.println(marbleDuck.getName());


        // Polymorphism
        Bird[] birds = new Bird[3];
        birds[0] = new Duck();
        birds[0].setName("mallard");
        birds[1] = new Finch();
        birds[1].setName("Lesser Gold Finch");
        birds[2] = new Penguin();
        birds[2].setName("Emperor Penguin");


    }

}
