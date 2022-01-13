package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in); // variable setup as a scanner


    public String getString(){
        System.out.println("Enter string.");
        String userInput = scanner.nextLine();
        return userInput;
    }
    // Bonus
    public String getString(String prompt){
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public boolean yesNo(){
        System.out.println("Would you lke to continue?");
        String answer = scanner.nextLine();
        if ( answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max){
        System.out.printf("Enter a number within the range of %d and %d \n", min, max);
        int userInput1 = scanner.nextInt();
        if (userInput1 <= min || userInput1 >= max){
            System.out.println("Numbers not in range.");
            return getInt(min, max);
        } else {
            System.out.format("You entered %d .", userInput1);;
            return userInput1;
        }
    }

    public int getInt(){
        System.out.println("Enter a number.");
        int num = scanner.nextInt();
        return num;
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter double within range of %f and %f: \n", min, max);
        double userInput = scanner.nextDouble();
        if(userInput <= min || userInput >= max){
            System.out.println("Number not in range.");
            return getDouble(min, max);
        } else {
            System.out.format("This %f is within range.", userInput);
            return userInput;
        }
    }

    public double getDouble(){
        System.out.println("Enter a double.");
        double num = scanner.nextDouble();
        return num;
    }


    public static void main(String[] args){


    }
}
