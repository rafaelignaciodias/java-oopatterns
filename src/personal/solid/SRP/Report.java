package personal.solid.SRP;

public class Report {
    private String content;

    // CONSTRUCTORS ///////////////////////////////////////////////////////////

    public Report() {
        this.content = "Default Report Content";
    }

    public Report(String content) {
        setContent(content);
    }

    // GETTERS AND SETTERS ////////////////////////////////////////////////////

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    // METHODS ////////////////////////////////////////////////////////////////

    public void generateReport() {
        // Simulate report generation
        content = "Report Content: " + System.currentTimeMillis();
    }
}
