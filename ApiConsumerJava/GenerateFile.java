package ApiConsumerJava;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Class to generate and save a JSON file for a Movie object.
 */
public class GenerateFile {

    /**
     * Saves the Movie object as a JSON file with a filename based on the movie title.
     *
     * @param movie The Movie object to save as a JSON file.
     * @throws IOException If an I/O error occurs while saving the file.
     */
    public void saveJson (Movie movie) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fileWriter = new FileWriter(movie.title()+".json");
        fileWriter.write(gson.toJson(movie));
        fileWriter.close();
    }
}
