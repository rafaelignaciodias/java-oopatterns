package personal.facade.hometheater;

public class RunHomeTheater {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector proj = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, proj);

        homeTheater.watchMovie("Inception");
    }
}