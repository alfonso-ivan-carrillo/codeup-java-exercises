public class MethodsExercises {


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

    public static void main(String[] args){

//        System.out.println(additionMethod(5, 10));
//        System.out.println(subtractionMethod(9, 19));
//        System.out.println(multiplicationMethod(5, 5));
//        System.out.println(divisionMethod(10, 2));
////        System.out.println(divisionMethod(10, 0));
//        System.out.println(modulusMethod(10, 2));
//        System.out.println(modulusMethod(10, 3));
        System.out.println(multiMethod(3, 3));

    }

}
