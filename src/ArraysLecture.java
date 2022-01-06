import shapes.Circle;

import java.util.Arrays;

public class ArraysLecture {

    public static void main(String[] args){


        // Java creating an array
        // To defin an array, we establish the data type, use square brackets, establish the variable
        // name, and then instantiate the array with the length inside the square brackets.
        String[] fruits = new String[4];
        // then you populate the array by entering the data
        // In Java, an array all elements must be of the same data type.
        fruits[0] = "orange";
        fruits[1] = "apple";
        fruits[2] = "banana";
        fruits[3] = "grapefruit";

        System.out.println(fruits[0]);

        // can also create an array string literal notation
        boolean[] surveyAnswers = {true, false, true, false, true, false, true};

        System.out.println(surveyAnswers.length);

        // iterating through an array - FOR LOOP
        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        // Ehanced FOR LOOP
        // JavaScript Syntax
        // for (let element of array){}

        // Java - For Each Loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        for (boolean surveyAnswer : surveyAnswers){
            System.out.println(surveyAnswer);
        }

        System.out.println(fruits); // returns ->Ljava.lang.String;@398d940c

        // The Arrays Class

        // Arrays.toString(); --> needs array utils -import java.util.Arrays; - returns a string with the elements in the array

        System.out.println(Arrays.toString(fruits));

        // Arrays.fill() - void, does not return anythingn, just does the thing.

        String[] stickers = new String[6];
        Arrays.fill(stickers, "(>^.^)><(>^.^)");
        System.out.println(Arrays.toString(stickers));
        // returns [(>^.^)><(>^.^), (>^.^)><(>^.^), (>^.^)><(>^.^), (>^.^)><(>^.^), (>^.^)><(>^.^), (>^.^)><(>^.^)]


        // Arrays.equals() - returns a boolean - takes to args to see if they are equal

        String[] extraFruits = {"orange", "apple", "banana", "grapefruit"};
        System.out.println(Arrays.equals(fruits, extraFruits));
        // returns true - will return false if elements are not in matching order
        // also if not the same length
        // can also use Arrays.equals(fruits, extraFruits);


        // Arrays.copyOf() - returns a copy of the array.

        String[] fruitClones = Arrays.copyOf(extraFruits, 10);
        fruitClones[9] = "pineapple";
        System.out.println(Arrays.toString(fruitClones)); // extraFruits array is 4 in length, the other will pull up as null
//        String[] fruitClones1 = Arrays.copyOf(extraFruits, 4);
//        System.out.println(Arrays.toString(fruitClones1));


        // Arrays.sort() - NO RETURN.  Just sorts the elements in the array.
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));


        // TWO-Dimensional Arrays - arrays within an array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

// access the first element in the second row - matrix[y-axis] [x-axis]
        System.out.println(matrix[1][0]); // 4
// the last element in the first row
        System.out.println(matrix[0][2]); // 3
// the first element in the last row
        System.out.println(matrix[2][0]); // 7


        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");


        // Array of OJBECTS - (used circle object from circle app class)
        Circle[] circles = {new Circle(4), new Circle(5)};
        System.out.println(circles[0].getArea());


    }
}
