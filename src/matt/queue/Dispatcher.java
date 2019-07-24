package matt.queue;

public class Dispatcher {

    private CallerQueue callerQueue;
    private OperatorQueue operatorQueue;

    public Dispatcher() {
        this.callerQueue = new CallerQueue();
        this.operatorQueue = new OperatorQueue();
    }

    public void call(int number, int time) {
        IncomingCall call = new IncomingCall(number, time);
        callerQueue.add(call);
    }

    public void freeOperator(String name, int time) {
        operatorQueue.add(new FreeOperator(name, time));
    }

    public void dispatchCall() {

        if(callerQueue.get() != null && operatorQueue.get() != null) {
            assignCall(callerQueue.get(), operatorQueue.get());

            callerQueue.removeFirst();
            operatorQueue.removeFirst();
        }
        else {
            System.out.println("Couldn't make a match.. Maybe one queue is emtpy.");
        }
    }

    private void assignCall(IncomingCall call, FreeOperator operator) {
        System.out.println(operator.getName() + " is answering call from +420 " + call.getCallingNumber());
        System.out.println("The caller has waited for " + Math.max(0, operator.getTime() - call.getTime()) + " seconds.");
    }

}
