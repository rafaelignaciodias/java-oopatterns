package personal.solid.ISP;

class MultiFunctionPrinter implements Printer, Scanner {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }
}
