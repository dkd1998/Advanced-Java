import java.util.*;

public class FetchData extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Data fetch started");
            Thread.sleep(5000);    
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Data fetch ended");
    }
}

public class ProcessData implements Runnable {
    public volatile boolean keepRunning = true;
    @Override
    public void run() {
            try {
                System.out.println("Starting to process data ");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Ending data processing");    
       }
}

public class ThreadRunExample {

    public static void main(String[] args){
        Thread t1 = new Thread(new FetchData(), "fetchData");
        Thread t2 = new Thread(new ProcessData(), "processData");
        System.out.println("Starting threads");
        t1.start();
        t2.start(); 
    }
}