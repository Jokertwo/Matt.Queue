package matt.queue;

public class OperatorQueue {

    private OperatorLink first;

    public void add(FreeOperator operator) {
        OperatorLink newLink = new OperatorLink();
        newLink.setData(operator);

        if (first == null) {
            first = newLink;
        } else {
            OperatorLink tempLink = first;
            while (tempLink.getNext() != null) {
                tempLink = tempLink.getNext();
            }
            tempLink.setNext(newLink);
        }
    }

    public FreeOperator get() {
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
            System.out.println("Remove operator on empty queue. Probably error, continuing...");
        }
    }


}
