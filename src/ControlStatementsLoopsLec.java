import java.util.Scanner;

public class ControlStatementsLoopsLec {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

//        boolean hasPizzaRolls = true;
//        boolean hasPepsiWildCherry = false;
//
//        System.out.printf("Is David repared for a night w/out Julienne: %b%n", hasPizzaRolls && hasPepsiWildCherry);
//        System.out.printf("Does David have something to guide him through the darktimes: %b%n", hasPizzaRolls || hasPepsiWildCherry);
//
//        System.out.printf("Will David go hungry: %b%n", !hasPizzaRolls);
//        System.out.printf("Will David go thirsty: %b%n", !hasPepsiWildCherry );

        // AND &&  -- OR ||    -- & and |
//        System.out.println(sc.nextBoolean() && sc.nextBoolean());
//        System.out.println(sc.nextBoolean() & sc.nextBoolean());

//        System.out.println(sc.nextBoolean() || sc.nextBoolean());
//        System.out.println(sc.nextBoolean() | sc.nextBoolean());

//        // Math Operators
//        System.out.println("Did you bring enough gum for the entire class? How many sticks of gum do yu have?");
//        int stickOfGum = sc.nextInt();
//
//        System.out.printf("Enough gum for the class: %b%n", stickOfGum >= 23);

        System.out.println("How much wood could a woodchuck chuck?");
        int chuckableWood = sc.nextInt();
//
//        System.out.printf("Got 'em: %b%n", chuckableWood > 0);

//        // equality operator - only works with primative data types
//        System.out.println("How many seasons of Lizzie McGuire were there?");
//        int lizzieSeasons = sc.nextInt();
//
//            // no triple === in java only ==
//        System.out.printf("Knows who Hilary Duff is: %b%n", lizzieSeasons == 2);
//        sc.nextLine(); // a way to clear out the info so a fall through does not occur
//
        System.out.println("Who was the 1994 and 1995 NBA Finals MVP?");
        String number34 = sc.nextLine();
            // when comparing strings, case(upper or lower) is compared - .equals
        System.out.printf("User from Houston && Likes Basketball: %b%n", number34.equals("Hakeem Olajuwon"));
            // unless you use .equalsIgnoreCase
        System.out.printf("User from Houston && Likes Basketball: %b%n", number34.equalsIgnoreCase("Hakeem Olajuwon"));


        // Control structures

//        if( chuckableWood > 0){
//            System.err.println("IF a woodchuck COULD chuck wood. ");
//        }


//        if (number34.equalsIgnoreCase("Clyde Drexler")){
//            System.out.println("He did't join the Rockets until '95.");
//        } else if (!number34.equalsIgnoreCase("Hakeem Olajuwon")){
//            System.out.println("I guess we never could be friends......");
//        } if (lizzieSeasons == 2){
//            System.out.println("I take that back, were cool.");
//        }

    // Switch Statements
//        switch (stickOfGum){
//            case 23:
//                System.out.println("That is just enough gum for everyone!");
//                break;
//            case 22:
//                System.out.println("How selfless of you to share your gum with the class!");
//                break;
//            case 24:
//                System.out.println("Oh so you get two pieces?! No gum in class!");
//                break;
//            default:
//                System.out.println("No gum in class!");
//        }

        // loops

        // while loops
        while (!number34.equalsIgnoreCase("Hakeem Olajuwon")){
            System.out.println("You wanna try that again? Who was the man to lead the rockets to two NBA Championships ");
            number34 = sc.nextLine();
        }

        // do while loops
        do {
            System.out.println("How much would could a woodchuck chuck?");
            chuckableWood = sc.nextInt();
        } while(chuckableWood > 0);

        // for loops
        for(int i = 1; i <= 20; i++){
            System.out.println(i);
        }



    }
}
