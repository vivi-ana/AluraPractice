package OOPJava;

import OOPJava.Model.Favorite;
import OOPJava.Model.Podcast;
import OOPJava.Model.Song;

public class Main {
    public static void main(String[] args) {
        Song mySong = new Song();
        mySong.setTitle("Thunderstruck");
        mySong.setAuthor("AC/DC");

        // Simulate playing the song 1000 times and liking it 6000 times
        for (int i = 0; i < 1000; i++) {
            mySong.play();
        }
        for (int i = 0; i < 6000; i++) {
            mySong.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("TED talks");
        myPodcast.setHost("Brené Brown");

        // Simulate playing the podcast 100 times and liking it 8000 times
        for (int i = 0; i < 100; i++) {
            myPodcast.play();
        }
        for (int i = 0; i < 8000; i++) {
            myPodcast.like();
        }

        // Display the total views and likes for the song
        System.out.println("The total of views for the song " + mySong.getTitle() + " is " + mySong.getTotalOfViews());
        System.out.println("The total of likes for the song " + mySong.getTitle() + " is " + mySong.getTotalOfLikes());

        // Create a Favorite object and add the song and podcast to favorites
        Favorite myFavorite = new Favorite();
        myFavorite.add(mySong);
        myFavorite.add(myPodcast);

        // Display the total of favorite items that have been added.
        System.out.println("You have " + myFavorite.getTotalOfFavorite() + " favorites.");
    }
}
