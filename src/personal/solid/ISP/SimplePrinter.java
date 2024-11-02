package personal.solid.ISP;

class SimplePrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Simple Printer: Printing document: " + document);
    }
}
