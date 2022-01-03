import java.util.Locale;

public class MethodsLecture {

    // Methods
    /* A java method is a collection of statements that are grouped together to perform an operation.
    * Methods can be defined with or w/out parameters, as well as with or w/out a return type*/


    public static int returnNum(int num){
        return num;
    }

    public static void leaveTheHouse(){
        System.out.println("I'm leaving the house...");
        return;  // exits out of the method, if another condition/stmt is below that, it will not be read by the system
    }


    // Method Overloading
    /* Method overloading is a way to define the same method with different method signatures (parameters).
    * */
    // version 1
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }
    }
    // version 2
    public static void sayHello() {
        sayHello("Hello", "World");
    }
    // version 3
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }
    // version 4
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
    }

    /*
    ToDo: Create a method, getDifference, that takes in two integers and returns the difference between the higher integer and the lower integer (subtract).
    -if both integers are equal, the order of operands doesn't matter.
    -if only one integer is passed, treat the calculation as if the zero was passed as the second parameter
    * */

    public static int getDifference(int num1, int num2){
        if (num1 > num2){
            return num1 - num2;
        } else {
            return num2 - num1;
        }
    }

    public static int getDifference(int num1){
        return getDifference(num1, 0);  // or return num1 - 0;
    }

    public static double getDifference(double num1, double num2){
        if (num1 > num2){
            return num1 - num2;
        } else {
            return num2 - num1;
        }
    }

    // Recursion
    /* Recursion is a process where a method calls itself repeatedly.
    A method that calls itself is referred as a recursive method.
    A recursive method must have a condition that will end the recursive calls.
    Use Cases
    Recursion allows programmers to express certain algorithms in a simpler way. Recursive solutions can be less efficient and possibly be less efficient.
     */

    // Create a method that changes all o's to zeros.
    public static String oToZero(String input){
        System.out.println("Your string is now:" + input);
        input.toLowerCase();
        int indexofNextOh = input.indexOf('o');
        if(indexofNextOh == -1) {
            return input;
        }
        input = input.replace('o', '0');
        return oToZero(input);
    }




    // public static returnType nameofMethod(){}
    public static void main(String[] args) {

        System.out.println(returnNum(7));

        leaveTheHouse();  // if you wanted to call in a different class, you would reference the class and then the method, like under the HelloWord Class, you could call it like this MethodsLecture.leaveTheHouse();

        sayHello(); // calls version 2, but w/in the method, it calls version 4

        sayHello("Regulus"); // calls version 3, within method, calls version 4

        sayHello(3); // calls version 1

        sayHello("Hi", "Bud"); // calls version 4


        System.out.println(getDifference(5));
        System.out.println(getDifference(9, 10));
        System.out.println(getDifference(10, 9));
        System.out.println(getDifference(10.5, 5.5));
        oToZero("Potato Tomato Tomato Potato");

    }



}
