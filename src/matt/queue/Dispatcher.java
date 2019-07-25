package matt.queue;

public class Dispatcher {

    private CallerQueue callerQueue;
    private OperatorQueue operatorQueue;
    private LongestWaiter longestWaiter = new LongestWaiter(0, 0);

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

    /**
     * match the first call and operator from their queues, if they exist
     * @return String, either Couldn't make a match, or the result from assignCall - message is passed to the logger
     */
    public void dispatchCall(Logger log) {



        if(callerQueue.get() != null && operatorQueue.get() != null) {

            log.log(assignCall(callerQueue.get(), operatorQueue.get()));

            callerQueue.removeFirst();
            operatorQueue.removeFirst();
        }
        else {

            log.log("Couldn't make a match.. Maybe one queue is empty." + System.lineSeparator());

        }
    }

    /**
     * Calculates how much time the caller actually waited and puts this into a string
     * @param call
     * @param operator
     * @return the result of this string
     */
    private String assignCall(IncomingCall call, FreeOperator operator) {

        int waitTime = Math.max(0, operator.getTime() - call.getTime());

        String message = operator.getName() + " is answering call from +420 " + call.getCallingNumber() + ". The caller has waited for " + waitTime + " seconds." + System.lineSeparator();
        System.out.println(message);

        //Test if the current caller's wait time was greater than the longest waiter yet. If it's true, set this caller as the longest waiter yet.
        if (waitTime > longestWaiter.getTotalWaitTime()){
            longestWaiter.setCallNumber(call.getCallingNumber());
            longestWaiter.setTotalWaitTime(waitTime);
        }

        return message;
    }

    public LongestWaiter getLongestWaiter() {
        return longestWaiter;
    }
}
