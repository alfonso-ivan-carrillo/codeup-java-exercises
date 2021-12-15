public class HelloWorld {
    public static void main(String[] args){
        System.out.print("Hello");
        System.out.print(" World!");

        byte month = 12;
        System.out.println(month);

        short daysInYear = 365;
        System.out.println(daysInYear);

        String greeting = "Hello, there!";
        System.out.println(greeting);

        String name;
        name = "Alfonso";
        System.out.println(name);

        float pi = 3.14f;
        System.out.println(pi);

        // cannot reassign the value of a final variable.
        final String APIKEY = "asdfasdf34234lkj234k23l";
        System.out.println(APIKEY);


        int firstNumber = 20;
        int secondNumber = 25;
        System.out.println(firstNumber + secondNumber);

        int increment = 0;
        increment++;
        System.out.println(increment);

        int decrement = increment;

        decrement--;

        System.out.println(decrement);


        // CASTING is coercing a value of one type into another.
        // Implicit CASTING - less specific data type, to a more specific data type.

        byte dayOfMonth = 14;
        byte birthday = 24;

        int result = dayOfMonth * birthday;

        // String name = "codeup";
        System.out.printf("Hello there, %s. Nice to see you. \n", name);

        // Explicit Casting - more specific data type, to less specific data type.
//        int x = 900;
//        int y = 800;
//
//        int difference = (byte)(x -y);
//
//        System.out.println(difference);

        // --> Syntax, data types and variables exercises <--

        // question 1
        int myFavoriteNumber = 2;
        System.out.println(myFavoriteNumber);
        // question 2
        String myString = "Pearl Jam";
        System.out.println(myString);

        // question 3: notice error
        // char tempString = myString;

        // question 4: notice error - data type
        // myString = 3.14159;

        // question 5: error message received - variable not initialized
        // question 6 & 7: error due to length of number, could be an int or short
        // note: 123L - L denotes a long
        // question 8: due to length of number
        // question 9: change to double or cast float myNumber = (float)(3.14);
        float myNumber = 3.14f;
        // float myNumber = (float)(3.14);
        // double myNumber = 3.14;
        System.out.println(myNumber);

        // question 10 pre and post increment
        // int x = 5;
        // System.out.println(x++);
        // System.out.println(x);

        // int x = 5;
        // System.out.println(++x);
        // System.out.println(x);

        // question 11: error received - class is a reserved word
        // int class;

        // question 12: error received String and Interger incompatible
        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;

        // string cannot be converted to int
        // int three = (int) "three";


        // question 13
        // int x = 4;
        // x += 5;

        // int x = 3;
        // int y = 4;
        // y *= x;

        int x = 10;
        int y = 2;
        x /=y;
        y -=x;
        System.out.println(x);
        System.out.println(y);

        // question 14 : you must use implicit or explicit casting to resolve the issue.

        // code below will cause a complier error
        // byte  biggerInt = 129;

        System.out.println(Integer.MAX_VALUE);





    }
}
