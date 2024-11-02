package personal.solid.LSP.solution;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[] {
                new Sparrow(),
                new Ostrich()
        };

        for (Bird bird : birds) {
            // If the bird can fly, call the fly method
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            } else {
                System.out.println("This bird cannot fly.");
            }
        }
    }
}
