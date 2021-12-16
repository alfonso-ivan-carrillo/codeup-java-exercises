import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args){

        // question 1
//        double pi =3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f", pi);

        // scanner exercises
        // question 1 - error if string is inputed instead of an int
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter an interger.");

//        int userInput = scanner.nextInt();

        // question 2 - using next() only the first word is captured, the rest entered in line are ignored
        // if you don't enter the requested words, when you press enter, the cursor moves down but the system is stlll
        // waiting for the user input
//        Scanner scannerOne = new Scanner(System.in);
//        Scanner scannerTwo = new Scanner(System.in);
//        Scanner scannerThree = new Scanner(System.in);
//
//        System.out.println("Please enter three words.");
//
//        String wordCaptureOne = scannerOne.next();
//        String wordCaptureTwo = scannerTwo.next();
//        String wordCaptureThree = scannerThree.next();
//
//        System.out.println(wordCaptureOne);
//        System.out.println(wordCaptureTwo);
//        System.out.println(wordCaptureThree);
//
        // question 3 - only one word is catured
//        Scanner scannerNext = new Scanner(System.in);
//
//        System.out.println("Please enter a sentence.");
////        String wordCaptureFour = scannerNext.next();
//        String wordCaptureFour = scannerNext.nextLine();
//
//        System.out.println(wordCaptureFour);

        // Perimeter Exercise
        // question 1
//        Scanner scannerShortSide = new Scanner(System.in);
//        Scanner scannerLongSide = new Scanner(System.in);
//
//        String shortSide = scannerShortSide.next();
//        String longSide = scannerLongSide.next();
//
//        System.out.println("Perimeter: " + ((Integer.parseInt(shortSide) * 2) + (Integer.parseInt(longSide) * 2)));
//        System.out.println("Area: " +  Integer.parseInt(shortSide) * Integer.parseInt(longSide));

        // Bonuses
        Scanner scannerShortSide = new Scanner(System.in);
        Scanner scannerLongSide = new Scanner(System.in);
        Scanner scannerHeight = new Scanner(System.in);

        String shortSide = scannerShortSide.next();
        String longSide = scannerLongSide.next();
        String height = scannerHeight.next();
        int shortInt = (Integer.parseInt(shortSide));

        

        System.out.println("Perimeter: " + ((Integer.parseInt(shortSide) * 2) + (Integer.parseInt(longSide) * 2)));
        System.out.println("Area: " +  Integer.parseInt(shortSide) * Integer.parseInt(longSide));
        System.out.println("Volume: " + (Integer.parseInt(shortSide) * Integer.parseInt(longSide) * Integer.parseInt(height)));



//        Scanner in = new Scanner(System.in);
//        int integer;
//        long longInteger;
//        float realNumber;
//        double doubleReal;
//        String string1;
//        String string2;
//
//        System.out.println("Enter an integer, a long integer, " + "a floatin-point" );
//        System.out.println("number, another floating-point number, " + "and a string.");
//        System.out.println("Separate each with a blank or return.");
//
//        integer = in.nextInt();
//        longInteger = in.nextLong();
//        realNumber = in.nextFloat();
//        doubleReal = in.nextDouble();
//        string1 = in.nextLine();
//        System.out.println("Now enter another value.");
//        string2 = in.next();
//
//        System.out.println("Here is what you entered: ");
//        System.out.println(integer + " " + longInteger + " " + realNumber +
//                " " + doubleReal + " " + string1 +
//                " and " + string2);






    }
}
