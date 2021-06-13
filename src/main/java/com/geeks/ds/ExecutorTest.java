package com.geeks.ds;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ExecutorTest {


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ReentrantLock lock = new ReentrantLock();

        executorService.submit(() -> {
           lock.lock();
           try {
               Thread.sleep(1);
           } catch (InterruptedException e) {
               e.printStackTrace();
           } finally {
               lock.unlock();
           }
        });


        executorService.submit(() -> {
            System.out.println("Locked "+lock.isLocked());
            System.out.println("held by me "+lock.isHeldByCurrentThread());
            boolean tryLock = lock.tryLock();
            System.out.println("Lock accquired "+tryLock);
        });


    }
}
