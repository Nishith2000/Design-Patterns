package org.design_pattern.facade_pattern;

public class MoviePlayer {

    public void playMovie(String movieName) {
        System.out.println("Playing movie: " + movieName);
    }

    public void off() {
        System.out.println("Switching off MoviePlayer...");
    }
}
