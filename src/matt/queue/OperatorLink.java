package matt.queue;

public class OperatorLink {
    private FreeOperator data;
    private OperatorLink next;

    public FreeOperator getData() {
        return data;
    }

    public OperatorLink getNext() {
        return next;
    }

    public void setData(FreeOperator data) {
        this.data = data;
    }

    public void setNext(OperatorLink next) {
        this.next = next;
    }
}
