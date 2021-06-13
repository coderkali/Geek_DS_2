package com.geeks.ds;

import java.util.ArrayList;
import java.util.List;

public class QueueTest {
    public List<String> queueSequence;
    public void setUp(){
        try{
            establishQUeue();
        }finally{
            cleanupQueue();
            System.out.println("QUeue Sequence successfulley cleaned up");
        }
    }

    private void cleanupQueue(){
        if(queueSequence.size() > 0){
            System.out.println("Queue Size > 0");
        }
    }

    private void establishQUeue(){
        if(true){
            throw new IllegalArgumentException();
        }
        queueSequence = new ArrayList<String>();
    }


    public static void main(String[] args) {
        QueueTest  t = new QueueTest();
        t.setUp();
        System.out.println("Process completed");
    }
}
