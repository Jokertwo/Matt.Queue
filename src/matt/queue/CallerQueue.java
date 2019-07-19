package matt.queue;

public class CallerQueue {

    private Link first, last;

    public void add(IncomingCall call) {
        Link nl = new Link();
        nl.data = call;
        if (first == null) {
            first = nl;
            last = nl;
        } else {
            last = nl;
        }
    }

    public IncomingCall get() {
        if (first != null) {
            return null;
        } else {
            return first.data;
        }
    }

    public void removeFirst() {
        if (first != null) {
            first = first.next;
        } else {
            System.out.println("Remove call on empty queue. Probably error, continuing...");
        }
    }
}
