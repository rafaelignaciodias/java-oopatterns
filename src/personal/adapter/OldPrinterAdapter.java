package personal.adapter;

public class OldPrinterAdapter implements Printer {
    private OldPrinter oldPrinter =  null;

    public OldPrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print(String text) {
        oldPrinter.printInOldFormat(text);
    }
}
