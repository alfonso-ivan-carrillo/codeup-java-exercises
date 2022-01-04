import java.util.Scanner;

public class MethodsExercises {

    // Start of Question 1
    // addition method
    public static int additionMethod(int num1, int num2){
        return num1 + num2;
    }

    // subtraction method
    public static int subtractionMethod(int num1, int num2){
        return num1 - num2;
    }

    // multiplication method
    public static int multiplicationMethod(int num1, int num2){
        return num1 * num2;
    }


    // division method
    public static int divisionMethod(int num1, int num2){
        if(num1 == 0){
            return 0;
        }
        return num1 / num2;
    }

    // modulus method
    public static int modulusMethod(int num1, int num2){
        return num1 % num2;
    }

    // Bonus for Question 1
    public static int multiMethod(int num1, int num2){
        int counter = 1;
        int num3 = 0;
        while (counter <= num2){
            num3 = (num3 + num1);
            counter++;
        }
        return num3;
    }
    // End of Question 1

    // Question 2
    public static int getInteger(int min, int max){
        if (min >= 0 && min <= 20 && max >= 0 && max <= 20){
            System.out.println("Your range is: " + (max - min));
            return min - max;
        } else {
            System.out.println("Numbers not in range.");
            System.out.println("Enter a number between 1 and 20:");
            Scanner scn = new Scanner(System.in);
            int userInput1 = scn.nextInt();
            System.out.println("Enter a second number between 1 and 20:");
            int userInput2 = scn.nextInt();
            return getInteger(userInput1, userInput2);
        }
    }

    // Question 3
    public static long factorial(long num){
            long fac = 1;
            if (num >= 1 && num <= 10) {
                for (int i = 1; i <= num; i++) {
                    fac = fac * i;
                }
                System.out.println(fac);
                return fac;
            } else {
                System.out.println("Numbers not in range.");
                System.out.println("Enter a number between 1 and 10:");
                Scanner scn = new Scanner(System.in);
                int userInput1 = scn.nextInt();
                return factorial(userInput1);
            }
    }

    // Question 4
    public static int dice(int sides){
        int dice1 = (int) (1 + (Math.random() * sides));
        int dice2 = (int) (1 + (Math.random() * sides));
        System.out.println(dice1);
        System.out.println(dice2);
        return dice1;
    }

    public static void rollDice(){
        String rollTheDice = "yes";
        while (rollTheDice.equalsIgnoreCase("yes")){
            System.out.println("Enter the number of sides on pair of dice.");
            Scanner scn = new Scanner(System.in);
            int sides = scn.nextInt();

            System.out.println("roll dice? yes/no");
            String play = scn.next();
            if (play.equalsIgnoreCase("yes")){
                dice(sides);
            } else {
                rollTheDice = "no";
            }
            System.out.println("Try again?");
            rollTheDice = scn.next();
        }
    }


    public static void main(String[] args){
        //  for question 1
//        System.out.println(additionMethod(5, 10));
//        System.out.println(subtractionMethod(9, 19));
//        System.out.println(multiplicationMethod(5, 5));
//        System.out.println(divisionMethod(10, 2));
////        System.out.println(divisionMethod(10, 0));
//        System.out.println(modulusMethod(10, 2));
//        System.out.println(modulusMethod(10, 3));
//        System.out.println(multiMethod(3, 3));

        // for question 1
//        System.out.println("Enter a number between 1 and 20:");
//        Scanner scn = new Scanner(System.in);
//        int userInput1 = scn.nextInt();
//        System.out.println("Enter a second number between 1 and 20:");
//        int userInput2 = scn.nextInt();
//        getInteger(userInput1, userInput2);

        // for question 3
//        String continueFactorial = "yes";
//        while (continueFactorial.equalsIgnoreCase("yes")) {
//            System.out.println("Enter a number between 1 and 10:");
//            Scanner scn = new Scanner(System.in);
//            long userInputFac = scn.nextLong();
//            factorial(userInputFac);
//            System.out.println("Do you wish to continue? yes/no");
//            continueFactorial = scn.next();
//        }

        rollDice();


    }

}
