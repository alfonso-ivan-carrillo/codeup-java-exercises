package BirdHaven;

// Supper Class - since other calls are inheriting
public class Bird {
    // can it fly?
    private boolean canFly;

    public void setCanFly(boolean canFly){
        this.canFly = canFly;
    }

    public boolean isCanFly(){
        return canFly;
    }

    // what kind of bird is it?
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void makeNoise(){
        System.out.println(this.getName() + " goes");
    }

    public void move(){
        System.out.println("Flap Flap");
    }

    // constructor
    public Bird(){
        // default - empty constructor - used to allow object to be created
    }
    public Bird(String name, boolean canFly){
        this.name = name;
        this.canFly = canFly;
    }


}
