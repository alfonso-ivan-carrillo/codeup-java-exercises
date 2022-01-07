package BirdHaven;

import java.util.Arrays;

public class BirdShelter {
    public void shelterSounds(Bird[] birdsOfTheShelter){

        for (Bird birdie : birdsOfTheShelter){
            birdie.makeNoise();
        }
    }
}
