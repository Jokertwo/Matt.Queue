package matt.queue;

public class Link {
    private IncomingCall data;
    private Link next;

    public IncomingCall getData() {
        return data;
    }

    public Link getNext() {
        return next;
    }

    public void setData(IncomingCall data) {
        this.data = data;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
