package org.design_pattern.facade_pattern;

public class HomeMovieTheaterFacade {

    private final Amplifier amplifier;
    private final Lights lights;
    private final MoviePlayer moviePlayer;
    private final Projector projector;

    public HomeMovieTheaterFacade(
            Amplifier amplifier,
            Lights lights,
            MoviePlayer moviePlayer,
            Projector projector) {
        this.amplifier = amplifier;
        this.lights = lights;
        this.moviePlayer = moviePlayer;
        this.projector = projector;
    }

    public void watchMovie(String movieName) {
        lights.off();
        projector.on();
        amplifier.on();
        amplifier.setVolume(75);
        moviePlayer.playMovie(movieName);
    }

    public void endMovie() {
        moviePlayer.off();
        amplifier.off();
        projector.off();
        lights.off();
    }
}
