public class Kitchen {

    private int workingHours;
    private String status;

    public Kitchen(int workingHours) {
        this.workingHours = workingHours;
    }

    public String getStatus() {
        return status;
    }

    public void open() {
        this.status = "Kitchen Opened";
    }

    public void close() {
        this.status = "Kitchen Closed";
    }
}
