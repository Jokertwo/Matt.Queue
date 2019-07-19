package matt.queue;

public class FreeOperator {

    private String name;
    private int pendingTime;

    public FreeOperator(String name, int pendingTime) {
        this.name = name;
        this.pendingTime = pendingTime;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return pendingTime;
    }
}
