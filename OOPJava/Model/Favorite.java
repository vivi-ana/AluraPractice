package OOPJava.Model;

/**
 * The Favorite class represents a collection of favorite audio items.
 * It provides a method to add an audio item and prints a message based on its ranking.
 */
public class Favorite {

    int totalOfFavorite;

    /**
     * Get the total number of favorite items that have been added.
     *
     * @return The total number of favorite items.
     */
    public int getTotalOfFavorite() {
        return totalOfFavorite;
    }

    /**
     * Add an audio item to the favorites and print a message based on its ranking.
     * If the audio item's ranking is equal to or higher than 8, it is considered one of the favorites.
     * Otherwise, it is mentioned that the audio item is climbing in the rankings.
     *
     * @param audio The audio item to be added to the favorites.
     */
    public void add(Audio audio) {
        if (audio.getRanking() >= 8) {
            System.out.println(audio.getTitle() + " is one of the favorites.");
        } else {
            System.out.println(audio.getTitle() + " is climbing in the rankings.");
        }
        totalOfFavorite++;
    }
}
