package personal.facade.hometheater;

class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, Projector proj) {
        this.amplifier = amp;
        this.dvdPlayer = dvd;
        this.projector = proj;
    }

    public void watchMovie(String movie) {
        amplifier.on();
        dvdPlayer.on();
        dvdPlayer.play(movie);
        projector.on();
        System.out.println("Enjoy your movie!");
    }
}
