package com.assign3;

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