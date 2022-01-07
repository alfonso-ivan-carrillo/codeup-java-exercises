package BirdHaven;

public class BirdShelterTest {
    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        birds[0] = new Duck();
        birds[0].setName("mallard");
        birds[1] = new Finch();
        birds[1].setName("Lesser Gold Finch");
        birds[2] = new Penguin();
        birds[2].setName("Emperor Penguin");

//        for(Bird birdie : birds){
//            birdie.makeNoise();
//        }
        BirdShelter healingWings = new BirdShelter();

//        healingWings.shelterSounds(birds);

        BirdLover audubonBob = new BirdLover();

        audubonBob.takeBirdVet(birds[1]);
    }
}
