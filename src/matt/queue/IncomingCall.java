package matt.queue;

public class IncomingCall {

    private int callingNumber;
    private int time; // the time from the beginning of the shift when the call arrived

    public IncomingCall(int callingNumber, int time) {
        this.callingNumber = callingNumber;
        this.time = time;
    }

    public int getCallingNumber() {
        return callingNumber;
    }

    public int getTime() {
        return time;
    }
}
