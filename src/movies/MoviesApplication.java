package movies;

import util.Input;


public class MoviesApplication {

//    Method to print all movies.
    private static void viewAllMovies(){

        Movie[] movies = MoviesArray.findAll();
        System.out.println("All Movies: ");

        for (Movie movie : movies){
            System.out.println(movie.getName() + "--" + movie.getCategory());
        }
        System.out.println();
    }

//    Method for specific Movies:
    private static void chooseMoviesByCategory(String category){
        Movie[] movies = MoviesArray.findAll();
        System.out.println(" Moivie Category: " + category);
        for (Movie movie : movies ){
            if (movie.getCategory().equalsIgnoreCase(category)){
                System.out.println(movie.getName());
            }
        }
        System.out.println();
    }
//    exit app
    public static void exitList (int status) {
        Runtime.getRuntime().exit(status);
    }
// Method to run the Movie Application

public static void runMovieApp() {
    Input input = new Input();
    do {
        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit\n" +
                "1 - View All Movies\n" +
                "2 - View Movies in the Animated Category\n" +
                "3 - View Movies in the Drama Category\n" +
                "4 - View Movies in the Horror Category\n" +
                "5 - View Movies in the Sci-Fi Category\n");
        int userschoice = input.getInt();
        System.out.println();
            if (userschoice == 1){
                viewAllMovies();
            } else if(userschoice == 2){
                chooseMoviesByCategory("animated");
            } else if (userschoice == 3) {
                chooseMoviesByCategory("drama");
            } else if (userschoice == 4) {
                chooseMoviesByCategory("horror");
            } else if (userschoice == 5) {
                chooseMoviesByCategory("scifi");
            } else if (userschoice == 0) {
                System.out.println("Exiting Movie application.....");
                exitList(0);
            }

    } while (true);
}















    public static void main(String[] args) {
        runMovieApp();
    }




}
