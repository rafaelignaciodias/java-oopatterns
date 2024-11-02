package personal.facade.hometheater;

class Amplifier {
    public void on() {
        System.out.println("Amplifier is on.");
    }
    public void setVolume(int level) {
        System.out.println("Setting volume to " + level);
    }
}