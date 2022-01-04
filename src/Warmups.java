import java.util.Scanner;

public class Warmups {

    public static String startDay(){
        return "Brain loading... Done!";
    }


    public static void main (String[] args){

        String message = "Java is statically typed, while Javascript is dynamically typed.";
        System.out.println(message);


        System.out.println("What did you eat for breakfast?");

        Scanner scannerBreakfast = new Scanner(System.in);
        String breakfast = scannerBreakfast.nextLine();

        System.out.println(breakfast + " are awesome!" );
        System.out.printf("%s, I wish i had that for brekfast!\n", breakfast);

        System.out.println(startDay());


    }
}
