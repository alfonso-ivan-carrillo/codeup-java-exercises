package movies;

import java.util.Arrays;
import java.util.Scanner;

import static movies.MoviesArray.findAll;

public class MoviesApplication {

//    public static void movieByName(){
//        Movie[] movies = MoviesArray.findAll();
//        for(Movie movie : movies){
//            System.out.println(movie.getName());
//        }
//    }

    public static void allMoviesByCategory(){
        Movie[] movies = MoviesArray.findAll();
        for(Movie movie : movies){
            System.out.println(movie.getName() + " : " + movie.getCategory());
        }
    }

    public static void movieByAnimatedCategory(){
        Movie[] movies = MoviesArray.findAll();
        for(Movie movie : movies){
            String cat = movie.getCategory();
            if(cat.equalsIgnoreCase("animated")){
                System.out.println(movie.getName() + " : " + movie.getCategory());
            }
        }
    }
    public static void movieByDramaCategory(){
        Movie[] movies = MoviesArray.findAll();
        for(Movie movie : movies){
            String cat = movie.getCategory();
            if(cat.equalsIgnoreCase("drama")){
                System.out.println(movie.getName() + " : " + movie.getCategory());
            }
        }
    }

    public static void movieByHorrorCategory(){
        Movie[] movies = MoviesArray.findAll();
        for(Movie movie : movies){
            String cat = movie.getCategory();
            if(cat.equalsIgnoreCase("horror")){
                System.out.println(movie.getName() + " : " + movie.getCategory());
            }
        }
    }
    public static void movieByScifiCategory(){
        Movie[] movies = MoviesArray.findAll();
        for(Movie movie : movies){
            String cat = movie.getCategory();
            if(cat.equalsIgnoreCase("scifi")){
                System.out.println(movie.getName() + " : " + movie.getCategory());
            }
        }
    }

    public static void movieMenu(){
        String keepGoing = "yes";
        do {
            System.out.println("0. Exit.");
            System.out.println("1. View all movies.");
            System.out.println("2. View movies in the animated category.");
            System.out.println("3. View movies in the drama category.");
            System.out.println("4. View movies in the horror category.");
            System.out.println("5. View movies in the scifi category.");
            System.out.println("Enter your choice: ");
            System.out.println("What would you like to do?");
            Scanner scn = new Scanner(System.in);
            int userInput = scn.nextInt();
            System.out.println();
            switch (userInput){
                case 0:
                    keepGoing = "no";
                    System.out.println("Exiting\n");
                    break;
                case 1:
                    allMoviesByCategory();
                    System.out.println("Returned to Menu.\n");
                    break;
                case 2:
                    movieByAnimatedCategory();
                    System.out.println("Returned to Menu.\n");
                    break;
                case 3:
                    movieByDramaCategory();
                    System.out.println("Returned to Menu.\n");
                    break;
                case 4:
                     movieByHorrorCategory();
                    System.out.println("Returned to Menu.\n");
                    break;
                case 5:
                    movieByScifiCategory();
                    System.out.println("Returned to Menu.\n");
                    break;
            }
        } while (keepGoing.equalsIgnoreCase("yes"));

    }

    public static void main(String[] args){

        movieMenu();



//        Movie[] movies = MoviesArray.findAll();
//
////        System.out.println(movies);
//
//        for(Movie movie : movies){
//            System.out.println(movie.getName());
//        }



    }
}
