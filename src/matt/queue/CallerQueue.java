package matt.queue;

public class CallerQueue {

    private Link first;

    public void add(IncomingCall call) {
        Link newLink = new Link();
        newLink.setData(call);

        if (first == null) {
            first = newLink;
        } else {
            Link tempLink = first;
            while (tempLink.getNext() != null) {
                tempLink = tempLink.getNext();
            }
            tempLink.setNext(newLink);
        }
    }

    public IncomingCall get() {
        if (first == null) {
            return null;
        } else {
            return first.getData();
        }
    }

    public void removeFirst() {
        if (first != null) {
            first = first.getNext();
        } else {
            System.out.println("Remove call on empty queue. Probably error, continuing...");
        }
    }
}
