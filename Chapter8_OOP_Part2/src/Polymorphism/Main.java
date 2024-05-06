package Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

        The older way to create an instance and to run that code

        Movie movie = new Adventure("Star Wars");
        movie.watchMovie();
        System.out.println();

        Movie movie1 = new Comedy("Happy Gilmore");
        movie1.watchMovie();
        System.out.println();

        Movie movie2 = new ScienceFiction("Men in black");
        movie2.watchMovie();
         */

        /*-------------------------------------------------------------------------
        Newer way of initiating classes, we just call the method in the movie class that does everything for us

        Movie theMovie = Movie.getMovie("Adventure", "Star Wars");
        theMovie.watchMovie();
         */

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter type(Adventure, Comedy, Science Fiction) OR enter Q to quit\n");
            String type = scanner.nextLine();

            // If a user types in an upper or a lower case Q then we would break out of the loop
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter Movie title: ");
            String title = scanner.nextLine();

            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
