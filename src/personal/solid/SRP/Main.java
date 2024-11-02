package personal.solid.SRP;

public class Main {
    public static void main(String[] args) {
        // METHODS ////////////////////////////////////////////////////////////

        // INSTANTIATING A REPORT OBJECT
        // GENERATING A REPORT USING A METHOD

        Report report = new Report();
        report.generateReport();


        // INSTANTIATING A REPORTPRINTER OBJECT
        // PRINTING A REPORT USING A METHOD

        ReportPrinter printer = new ReportPrinter();
        printer.printReport(report);
    }
}
