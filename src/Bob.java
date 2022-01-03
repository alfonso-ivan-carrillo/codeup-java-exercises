import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        String askBobAnotherQuestion = "yes";
        System.out.println("Ask Bob a question.");

        while (askBobAnotherQuestion.equalsIgnoreCase("yes")){
            String userInput = scn.nextLine();
            if (userInput.endsWith("?")){
                System.out.println("Bob: Sure.");
            } else if (userInput.endsWith("!")){
                System.out.println("Bob: Whoa, chill out!");
            } else if (userInput.equals(" ")){ // could also have used userInput.isEmpty();
                System.out.println("Bob: Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Ask Bob another question? (yes/no)");
            askBobAnotherQuestion = scn.nextLine();

        }

    }
}
