package com.geeks.ds;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Queue<String> queue = new LinkedList<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        queue.add(stack.pop());

        stack.push("Dingleberry");
        stack.push("EggPlant");
        queue.add("Fig");

        stack.push(queue.remove());
        queue.add(stack.pop());
        queue.add(stack.pop());

        System.out.println(stack);
        System.out.println(queue);



    }
}
