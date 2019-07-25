package matt.queue;

import java.io.*;
import java.util.Scanner;

public class CallDispatching {

    public static void main(String[] args) {

        Dispatcher d = new Dispatcher();
        Logger log = new Logger();

        //Clear dispatching.txt for new output
        Logger.clearLog();


        //Scan entire callCentrum.txt
        try {
            File file = new File("Matt.Queue/callCentrum.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {

                //Take a line from the file and assign it to the temp string - line
                String line = sc.nextLine();
                //Split the temp string - line - into a string away, each element separated by whitespace.
                String[] splitLine = line.trim().split("\\s+");
                //assign identifier variable to the first element in the string array, "O" or "C"
                String identifier = splitLine[0];

                //Assign O or C elements to the correct queue, operator or customer.
                switch (identifier) {
                    case "O":
                        d.freeOperator(splitLine[2], Integer.parseInt(splitLine[1]));
                        break;
                    case "C":
                        d.call(Integer.parseInt(splitLine[2]), Integer.parseInt(splitLine[1]));
                        break;
                    default:
                }
                //Write to log, each run of dispatch()
                d.dispatchCall(log);

            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        log.log("The number: " + d.getLongestWaiter().getCallNumber() + " waited the longest. They waited for: " + d.getLongestWaiter().getTotalWaitTime()  + " seconds.");

    }

        /*Dispatcher d = new Dispatcher();
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
        d.dispatchCall();*/


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
