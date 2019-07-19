package matt.queue;

public class CallerQueue {

    private Link first;

    public void add(IncomingCall call) {
        Link newLink = new Link();
        newLink.data = call;
        if (first == null) {
            first = newLink;
        } else {
            newLink.setNext(first);
            first = newLink;
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
