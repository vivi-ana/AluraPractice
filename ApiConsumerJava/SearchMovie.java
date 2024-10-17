package ApiConsumerJava;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Class to search for a movie based on its number.
 */
public class SearchMovie {

    /**
     * Finds and returns a Movie object based on the provided movie number.
     *
     * @param numberOfMovie The number of the movie to search for.
     * @return The Movie object found based on the provided movie number.
     * @throws RuntimeException If the movie is not found.
     */
    public Movie findMovie (int numberOfMovie) {

        URI address = URI.create("https://swapi.dev/api/films/"+numberOfMovie);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Movie.class);
        } catch (Exception e) {
            throw new RuntimeException("Movie not found");
        }
    }
}
