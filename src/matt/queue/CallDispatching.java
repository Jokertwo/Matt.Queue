package matt.queue;

public class CallDispatching {
    public static void main(String[] args) {

        Dispatcher d = new Dispatcher();
        d.freeOperator("Tim", 0);
        d.dispatchCall();
        d.freeOperator("Anna", 10);
        d.dispatchCall();
        d.call(608123456, 15);
        d.dispatchCall();
        d.call(723987654, 35);
        d.dispatchCall();
        d.call(602112233, 45);
        d.dispatchCall();
        d.freeOperator("Matt", 62);
        d.dispatchCall();
        d.call(608987654, 124);
        d.dispatchCall();
        d.freeOperator("Peter", 240);
        d.dispatchCall();


        //TESTING the queues
        /*CallerQueue callerQueue = new CallerQueue();
        OperatorQueue operatorQueue = new OperatorQueue();

        IncomingCall a = new IncomingCall(1, 1);
        IncomingCall b = new IncomingCall(2, 2);
        IncomingCall c = new IncomingCall(3, 3);
        IncomingCall d = new IncomingCall(4, 4);

        FreeOperator aa = new FreeOperator("aa", 1);
        FreeOperator bb = new FreeOperator("bb", 2);
        FreeOperator cc = new FreeOperator("cc", 3);
        FreeOperator dd = new FreeOperator("dd", 4);

        callerQueue.add(a);
        callerQueue.add(b);
        callerQueue.add(c);
        callerQueue.add(d);

        operatorQueue.add(aa);
        operatorQueue.add(bb);
        operatorQueue.add(cc);
        operatorQueue.add(dd);

        IncomingCall[] callerArray = {a, b, c, d};
        FreeOperator[] operatorArray = {aa, bb, cc, dd};

        boolean equal = true;

        for(int i = 0; i < 4; i++) {
            if (!callerQueue.get().equals(callerArray[i])) equal = false;

            System.out.println(callerQueue.get().getCallingNumber() + " " + callerArray[i].getCallingNumber());
            callerQueue.removeFirst();
            }

        for(int i = 0; i < 4; i++) {
            if (!operatorQueue.get().equals(operatorArray[i])) equal = false;

            System.out.println(operatorQueue.get().getName() + " " + operatorArray[i].getName());
            operatorQueue.removeFirst();
            }

        System.out.println(equal);*/


    }
}
