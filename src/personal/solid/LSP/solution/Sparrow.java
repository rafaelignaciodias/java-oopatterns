package personal.solid.LSP.solution;

class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying!");
    }
}
