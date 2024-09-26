package OOPJava.Model;

/**
 * The Song class represents a specific type of audio file that includes additional attributes
 * such as album, genre, and author. It extends the Audio class.
 */
public class Song extends Audio {
    private String album;
    private String genre;
    private String author;

    /**
     * Get the album of the song.
     * @return The album of the song.
     */
    public String getAlbum() {
        return album;
    }

    /**
     * Set the album of the song.
     * @param album The album of the song.
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    /**
     * Get the genre of the song.
     * @return The genre of the song.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Set the genre of the song.
     * @param genre The genre of the song.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Get the author of the song.
     * @return The author of the song.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Set the author of the song.
     * @param author The author of the song.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Override the getRanking method to calculate the ranking based on the total number of likes.
     * If the total number of likes is greater than 5000, the ranking is set to 8, otherwise it is set to 4.
     * @return The calculated ranking of the song.
     */
    @Override
    public int getRanking() {
        return getTotalOfLikes() > 5000 ? 8 : 4;
    }
}
