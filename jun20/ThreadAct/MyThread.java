package jun20.ThreadAct;

public class MyThread implements  Runnable{
    private String threadName;
    private int sleepTime;
    public MyThread(String threadName, int sleepTime) {
        this.threadName = threadName;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        System.out.println(threadName + " is starting.");
        try {
            Thread.sleep(sleepTime);
            System.out.println(threadName + " is sleeping for " + (sleepTime/1000) + " second(s).");
        } catch (InterruptedException e) {
            System.out.println(threadName + " is interrupted.");
        }
        System.out.println(threadName + " has finished.");
    }
}
