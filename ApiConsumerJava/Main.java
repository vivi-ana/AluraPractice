package ApiConsumerJava;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        SearchMovie searchMovie = new SearchMovie();

        System.out.println("Please enter the movie number of Star Wars that you want to search for");
        try {
            var numberOfMovie = getMovieNumberFromUser(keyboard);
            Movie movie = searchMovie.findMovie(numberOfMovie);
            displayMovieInformation(movie);
            generateFile(movie);
        } catch (NumberFormatException e){
            System.out.println("Number not found"+e.getMessage());
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Application finished");
        }
    }

    /**
     * Generates a JSON file for the provided Movie object.
     *
     * @param movie The Movie object for which the JSON file will be generated.
     * @throws IOException If an I/O error occurs while saving the JSON file.
     */
    private static void generateFile(Movie movie) throws IOException {
        GenerateFile generateFile = new GenerateFile();
        generateFile.saveJson(movie);
    }

    /**
     * Retrieves the movie number input from the user.
     *
     * @param keyboard The Scanner object used for user input.
     * @return The movie number entered by the user.
     */
    private static int getMovieNumberFromUser(Scanner keyboard) {
        return keyboard.nextInt();
    }

    /**
     * Displays information about the provided Movie object.
     *
     * @param movie The Movie object whose information will be displayed.
     */
    private static void displayMovieInformation(Movie movie) {
        System.out.println(movie);
    }
}
