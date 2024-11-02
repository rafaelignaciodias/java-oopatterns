package personal.adapter;

public class Client {
    private Printer printer;

    public Client(Printer printer) {
        this.printer = printer;
    }

    public void doPrint(String text) {
        printer.print(text);
    }

    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        Printer adapter = new OldPrinterAdapter(oldPrinter);
        Client client = new Client(adapter);

        client.doPrint("Hello, World!");
    }
}
