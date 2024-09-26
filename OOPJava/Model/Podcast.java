package OOPJava.Model;

/**
 * The Podcast class represents a specific type of audio content that includes additional attributes
 * such as host and description. It extends the Audio class.
 */
public class Podcast extends Audio {
    private String host;
    private String description;

    /**
     * Get the host of the podcast.
     * @return The host of the podcast.
     */
    public String getHost() {
        return host;
    }

    /**
     * Set the host of the podcast.
     * @param host The host of the podcast.
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * Get the description of the podcast.
     * @return The description of the podcast.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of the podcast.
     * @param description The description of the podcast.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Override the getRanking method to calculate the ranking based on the total number of views.
     * If the total number of views is greater than 2000, the ranking is set to 8, otherwise it is set to 2.
     * @return The calculated ranking of the podcast.
     */
    @Override
    public int getRanking() {
        return getTotalOfViews() > 2000 ? 8 : 2;
    }
}