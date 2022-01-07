import java.util.Random;

public class ServerNameGenerator {

    public static int getRandom(int[] array){
//        int randomNum = (int) (Math.random() * array.length);
        int rnd = new Random().nextInt(array.length);
        return array[rnd];

    }
    public static String getRandom(String[] array){
//        int randomNum = (int) (Math.random() * array.length);
        int rnd = new Random().nextInt(array.length);
        return array[rnd];

    }


    public static void main(String[] args){

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(getRandom(nums));

        String[] adjs = {"active", "bold", "confident", "eager", "hopeful", "idealistic", "fickle", "noble", "robust", "moralistic"};

        String[] nouns = {"Actor", "brother", "card", "dad", "employee", "family", "gold", "hand", "fish", "friend"};

        System.out.println(getRandom(adjs));

        String first = getRandom(adjs);
        String second = getRandom(nouns);
        System.out.printf("%s-%s \n", first, second);


    }
}
