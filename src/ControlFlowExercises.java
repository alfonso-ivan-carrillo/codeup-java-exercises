public class ControlFlowExercises {
    public static void main (String[] args){


//        int i = 5;
//
//        while (i <= 15){
//            System.out.print(i);
//            i++;
//        }

        for (int i = 5; i <= 15; i++){
            System.out.print(i);
        }
        System.out.printf("%n");;

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

        for (long y = 2; y <= 100; y +=2){
            System.out.println(y);
        }

        for (long y = 100; y >= -10; y -=5){
            System.out.println(y);
        }

        for (long y = 2; y <= 1000000; y = y * y){
            System.out.println(y);
        }

        for (int x = 0; x <= 100; x++){
            if (x % 3 == 0){
                System.out.println("Fizz");
            } else if (x % 5 == 0){
                System.out.println("Buzz");
            } else if ( x % 3 == 0 && x % 5 == 0){
                System.out.println("FizzBuzz");
            } else {
                System.out.println(x);
            }
        }


    }
}
