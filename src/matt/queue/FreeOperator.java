package matt.queue;

public class FreeOperator {

    private String name;
    private int time;

    public FreeOperator(String name, int time){
        this.name = name;
        this.time = time;
    }

    public int getTime(){
        return time;
    }

    public String getName(){
        return name;
    }

}
