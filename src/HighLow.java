import java.util.Scanner;

public class HighLow {

    public static int computerNumber(){
        int compNum = (int) (1 + (Math.random() * 100));
        System.out.println(compNum);
        return compNum;
    }

    public static int userGuess(){
        System.out.println("Make a guess.");
        Scanner scn = new Scanner(System.in);
        int guess = scn.nextInt();
        return guess;
    }

    public static void playGame(){
        int compNum = computerNumber();
        System.out.println("The CPU has choosen a random number.");
        int guess = userGuess();
        System.out.println(compNum);
        System.out.println(guess);
        String continueGame = "yes";
        while (continueGame.equalsIgnoreCase("yes")){
            if (compNum == guess){
                System.out.println("Good Guess!");
                continueGame = "no";
            } else if (guess < compNum){
                System.out.println("Higher!");
                guess = userGuess();
            } else if (guess > compNum){
                System.out.println("Lower!");
                guess = userGuess();
            }
        }


    }
    public static void main(String[] args){


        playGame();
    }
}
