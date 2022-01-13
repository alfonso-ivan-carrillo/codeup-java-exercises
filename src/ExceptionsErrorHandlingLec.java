import util.Input;

public class ExceptionsErrorHandlingLec {

    // methods have the ability to throw exceptions

    public static String getBestRocketsPlayer() throws Exception {
        Input in = new Input();
        String answer = in.getString("Who is the best Houston Rockets Player of All Time?");
        if(!answer.equalsIgnoreCase("Moochie Norris")){
            // throw new Exception("How dare you disrespect the Rockets fifth best point guard ever....");
            throw new DavidMadExceptionLec("How dare you disrespect the Rockets fifth best point guard ever....");
        }
        return "Correct! Moochie Norris was the best player.";
    }





    // if you want to run a method with a throw exceptions, then you need to add -> throws Exception <- in
    // the main method - public static void main(String[] args) throws Exception {
    public static void main(String[] args) {
//        try{
//            throw new Exception("No, Billy! Don't throw an exception!");
//        } catch (Exception e){
//            e.printStackTrace();
//            // allows you to provide information to the person using your application/code - helps with debug
//            System.out.println("I can still do some stuff after printing the exception's stack trace.");
//        }

//        try {
//            System.out.println("Let's see....");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e){
//            // serr -> space gives you the System.err.println(" ");
//            System.err.println("Math still works!");
//        }

//        int[] numbers = {1, 2, 3};
//        // block scoping - you want to declare variables and initialized outside the block (try-catch block)
//        // so it can be accessible outside the code block and inside
//        int x = 0;
//
//        try{
//            x = numbers[2];
//        } catch (ArrayIndexOutOfBoundsException e){
//        // you always want to have the most specific catch first
//            System.out.println("Caught an array index exception!");  // this will run because it's true
//        } catch (Exception e){
//            System.out.println("Caught a generic exception!");      // will  not run
//        } finally {
//            System.out.println("This will always run.");  // finally will always run
//        }
//        System.out.println(x);

        //  throw exception on method - needs to be handled, you can't just call it like getBestRocketsPlayer()
        //  needs to be placed in a try-catch block - it has to be handled or an exception will be thrown for handling
        try{
            getBestRocketsPlayer();
        } catch (Exception e) {
            e.printStackTrace();
            main(args);   // this re-runs the main method
        }








    }
}
