package personal.solid.ISP;

public class Main {
    public static void main(String[] args) {
        Printer printer = new SimplePrinter();
        printer.print("My Document");

        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.print("Multi-Function Document");
        multiFunctionPrinter.scan("Multi-Function Document");
    }
}
