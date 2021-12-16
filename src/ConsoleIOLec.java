import java.util.Scanner;

public class ConsoleIOLec {
    public static void main (String[] args){

        // Placeholder example
        String name = "Alfonso";
        String lastName = "Carrillo";
        // %(s) - s for string
        System.out.printf("Hello, my name is %s %s. \n", name, lastName);

        double pi = 3.14259;
        // %(f) - f for float or double  - for decimials
        System.out.printf("The number for pi is %f. \n", pi);

        int myFavoriteNumber = 2;
        // %(d) - d for whole numbers
        System.out.printf("My favorite number is %d.", myFavoriteNumber);

        // scanner -need to instantiated each time used
        // monitors user input or what is keyed
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favorite color?");
        // the scanner scans the user input/response
        // .next() takes in the next word
        // String userInput = scanner.next();
        // .nextLine() takes in the line
        String userInput = scanner.nextLine();

        System.out.printf("Your favorite color is %s.", userInput);





    }
}
