package personal.solid.LSP.violation;

class Ostrich extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly!");
    }
}