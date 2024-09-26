package OOPJava.Model;

/**
 * The Audio class represents an audio file with attributes such as title, duration,
 * total number of views, total number of likes, and ranking.
 */
public class Audio {
    private String title;
    private int duration;
    private int totalOfViews;
    private int totalOfLikes;
    private int ranking;

    /**
     * Get the title of the audio.
     * @return The title of the audio.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the title of the audio.
     * @param title The title of the audio.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the duration of the audio.
     * @return The duration of the audio.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Set the duration of the audio.
     * @param duration The duration of the audio.
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Get the total number of views of the audio.
     * @return The total number of views of the audio.
     */
    public int getTotalOfViews() {
        return totalOfViews;
    }

    /**
     * Set the total number of views of the audio.
     * @param totalOfViews The total number of views of the audio.
     */
    public void setTotalOfViews(int totalOfViews) {
        this.totalOfViews = totalOfViews;
    }

    /**
     * Get the total number of likes of the audio.
     * @return The total number of likes of the audio.
     */
    public int getTotalOfLikes() {
        return totalOfLikes;
    }

    /**
     * Set the total number of likes of the audio.
     * @param totalOfLikes The total number of likes of the audio.
     */
    public void setTotalOfLikes(int totalOfLikes) {
        this.totalOfLikes = totalOfLikes;
    }

    /**
     * Get the ranking of the audio.
     * @return The ranking of the audio.
     */
    public int getRanking() {
        return ranking;
    }

    /**
     * Set the ranking of the audio.
     * @param ranking The ranking of the audio.
     */
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    /**
     * Increment the total number of views when the audio is played.
     */
    public void play() {
        this.totalOfViews++;
    }

    /**
     * Increment the total number of likes when the audio is liked.
     */
    public void like() {
        this.totalOfLikes++;
    }
}
