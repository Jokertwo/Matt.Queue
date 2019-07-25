package matt.queue;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

    public static void clearLog(){
        try {
            PrintWriter clear = new PrintWriter(new FileWriter("Matt.Queue/dispatching.txt", false), false);
            clear.write("");
            clear.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void log(String message){

        try {
            PrintWriter out = new PrintWriter(new FileWriter("Matt.Queue/dispatching.txt", true), true);
            out.write(message);
            out.close();
            System.out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
