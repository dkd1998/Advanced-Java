package com.assign3;

public class ProcessData implements Runnable {
    public volatile boolean keepRunning = true;
    @Override
    public void run() {
            try {
                System.out.println("Starting to process data ");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Ending data processing");    
       }
}
