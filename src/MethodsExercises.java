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
        //instructor solution
        // if (num1 < num2){
        //  return num2 - num1;}
        // else {
        // return num1 - num2;
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
        System.out.format("Enter a number between %d and %d: \n", min, max);
        Scanner scn = new Scanner(System.in);
        int userInput1 = scn.nextInt();
        if (userInput1 <= min || userInput1 >= max){
            System.out.println("Numbers not in range.");
//            System.out.format("The %d is within range.", userInput1);
            return getInteger(min, max);
        } else {
            System.out.format("The %d is within range.", userInput1);;
//            userInput1 = scn.nextInt();
//            getInteger(min, max);
//            System.out.format("The %d is within range.", userInput1);
            return userInput1;
        }
    }

    // public static int getInteger(int min, int max){
    //      Scanner sc = new Scanner(System.in).useDelimiter("\n");
    //      System.out.println("please enter a number between 1 and 10");
    //      int userNum = sc.nextInt();
    //      if(userNum > max || userNum < min){
    //          return getInteger(min, max);
    //          }
    //      return userNum;
    //      }
    // under main method, call getInteger(1, 10);


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

    // Start of Question 4
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
    // End of Question 4




    public static void main(String[] args){
        //  for question 1
//        System.out.println(additionMethod(5, 10));
//        System.out.println(subtractionMethod(9, 19));
//        System.out.println(multiplicationMethod(5, 5));
//        System.out.println(divisionMethod(10, 2));
////        System.out.println(divisionMethod(10, 0));
//        System.out.println(modulusMethod(10, 2));
//        System.out.println(modulusMethod(10, 3));
        System.out.println(multiMethod(3, 5));

        // for question 2

        getInteger(1, 10);

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

//        rollDice();


    }

}
