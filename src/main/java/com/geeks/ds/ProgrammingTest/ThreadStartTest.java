package com.geeks.ds.ProgrammingTest;

public class ThreadStartTest {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Running");
            }
        };
        Thread mThread = new Thread(r);
        mThread.start();


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });

        thread.start();

        Runnable runnable = () -> {
            System.out.println("threading is running at Runnable");
        };

        new Thread(runnable).start();



    }
}
