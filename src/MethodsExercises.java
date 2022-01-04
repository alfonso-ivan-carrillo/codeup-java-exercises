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
//        System.out.println("Enter a number between 1 and 20:");
//        Scanner scn = new Scanner(System.in);
//        int userInput1 = scn.nextInt();
//        min = userInput1;
//        System.out.println("Enter a second number between 1 and 20:");
//        int userInput2 = scn.nextInt();
//        max = userInput2;
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

    public static void main(String[] args){

//        System.out.println(additionMethod(5, 10));
//        System.out.println(subtractionMethod(9, 19));
//        System.out.println(multiplicationMethod(5, 5));
//        System.out.println(divisionMethod(10, 2));
////        System.out.println(divisionMethod(10, 0));
//        System.out.println(modulusMethod(10, 2));
//        System.out.println(modulusMethod(10, 3));
//        System.out.println(multiMethod(3, 3));

        System.out.println("Enter a number between 1 and 20:");
        Scanner scn = new Scanner(System.in);
        int userInput1 = scn.nextInt();
        System.out.println("Enter a second number between 1 and 20:");
        int userInput2 = scn.nextInt();
        getInteger(userInput1, userInput2);


    }

}
