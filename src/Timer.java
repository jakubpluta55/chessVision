public class Timer {

    private long start;
    private long stop;


    public Timer(long start, long stop) {
        this.start = start;
        this.stop = stop;
    }

    public void start() {
        start = System.currentTimeMillis();
    }

    public void stop() {
        start = System.currentTimeMillis();
    }

    public double getTime(){
        return (stop-start) /1000;
    }

    public String toString(){
        return this.getTime() + "s. ";
    }


}








