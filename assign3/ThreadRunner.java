package com.assign3;

public class ThreadRunner {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new FetchData(), "fetchData");
        Thread t2 = new Thread(new ProcessData(), "processData");
        System.out.println("Starting threads");
        t1.start();
        t1.join();
        t2.start(); 

	}

}
