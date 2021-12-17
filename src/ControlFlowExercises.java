import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String[] args){


//        int i = 5;
//
//        while (i <= 15){
//            System.out.print(i);
//            i++;
//        }
//
//        for (int i = 5; i <= 15; i++){
//            System.out.print(i);
//        }
//        System.out.printf("%n");;

        // count by 2
//        int x = 0;
//
//        do {
//            x += 2;
//            System.out.println(x);
//        } while( x < 100);

        // count by 5
//        int x = 100;
//        do {
//            x -=5;
//            System.out.println(x);
//        } while (x > -10);

        // squared

//        long x = 2;

//        do {
//            System.out.println(x);
//            x = x * x;
//        } while (x < 100000);
//
//        for (long y = 2; y <= 100; y +=2){
//            System.out.println(y);
//        }
//
//        for (long y = 100; y >= -10; y -=5){
//            System.out.println(y);
//        }
//
//        for (long y = 2; y <= 1000000; y = y * y){
//            System.out.println(y);
//        }
//
//        for (int x = 0; x <= 100; x++){
//            if (x % 3 == 0){
//                System.out.println("Fizz");
//            } else if (x % 5 == 0){
//                System.out.println("Buzz");
//            } else if ( x % 3 == 0 && x % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(x);
//            }
//        }

        Scanner scn = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")){
            System.out.println("What number would you like to go up to?");
            int userInput = scn.nextInt();
            System.out.println("Number | " + "Squared |" + " Cubed");
            System.out.println("_______| " + "________|" + "_______");
//            System.out.println("       |" + "         |" + "      ");

            for (int i = 1; i <= userInput; i++){
                int numberSquared = (int) Math.pow(i, 2);
                int numberCubed = (int) Math.pow(i, 3);
                String message ="\n" + i + "      | " + numberSquared + "       | " + numberCubed;

                System.out.println(message);


            }
            System.out.print("Continue? (y/n): " );
            choice = scn.next();
            System.out.println();
        }

        String gradeChoice = "y";

        while(gradeChoice.equalsIgnoreCase("y")){
            System.out.println("What is your number grade?");
            int gradeInput = scn.nextInt();
            if( gradeInput >= 88 && gradeInput <= 100){
                System.out.println("You received an A.");
            } else if( gradeInput >= 80 && gradeInput <= 87){
                System.out.println("You received a B. ");
            } else if ( gradeInput >= 67 && gradeInput <= 79){
                System.out.println("You received a C.");
            }  else if ( gradeInput >= 60 && gradeInput <= 66){
                System.out.println("You received a D.");
            } else if ( gradeInput >= 0 && gradeInput <= 59){
                System.out.println("You received an F.");
            } else {
                System.out.println("That is out of range.");
            }
            System.out.print("Continue? (y/n): ");
            gradeChoice = scn.next();
            System.out.println();
        }













    }
}
