package org.design_pattern.facade_pattern;

public class Client {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Lights lights = new Lights();
        Projector projector = new Projector();
        MoviePlayer moviePlayer = new MoviePlayer();

        HomeMovieTheaterFacade homeMovieTheaterFacade =
                new HomeMovieTheaterFacade(amplifier, lights, moviePlayer, projector);

        homeMovieTheaterFacade.watchMovie("Mission Impossible");
        homeMovieTheaterFacade.endMovie();
    }
}
