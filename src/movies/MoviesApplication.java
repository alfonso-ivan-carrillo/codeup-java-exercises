package movies;

import java.util.Arrays;

import static movies.MoviesArray.findAll;

public class MoviesApplication {

//    Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args){

        Movie[] movies = MoviesArray.findAll();

        System.out.println(movies);

        for(Movie movie : movies){
            System.out.println(movie.getName());
        }



    }
}
