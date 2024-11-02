package personal.solid.SRP;

public class ReportPrinter {

    // METHODS ////////////////////////////////////////////////////////////////

    public void printReport(Report report) {
        System.out.println("Printing Report:");
        System.out.println(report.getContent());
    }
}
