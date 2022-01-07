package BirdHaven;

public class Penguin extends Bird{

    public void makeNoise(){
        System.out.println(this.getName() + " goes Honk Honk");
    }

    public void move(){
        System.out.println(this.getName() + " goes waddle waddle");
    }
}
