package matt.queue;

public class LongestWaiter {

    int callNumber;
    int totalWaitTime;

    public LongestWaiter(int callNumber, int totalWaitTime) {

        this.callNumber = callNumber;
        this.totalWaitTime = totalWaitTime;

    }

    public int getCallNumber() {
        return callNumber;
    }

    public int getTotalWaitTime() {
        return totalWaitTime;
    }

    public void setCallNumber(int callNumber) {
        this.callNumber = callNumber;
    }

    public void setTotalWaitTime(int totalWaitTime) {
        this.totalWaitTime = totalWaitTime;
    }
}
