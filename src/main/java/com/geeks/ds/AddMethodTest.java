package com.geeks.ds;

public class AddMethodTest {
    private int[] arr = null;
    private int count=0;

    public void add(int i){
        if(i!=0){
            if(arr ==null){
                arr = new int[10];
            }
            arr[i] =i;
        }
    }

    public int size(){
        for(int i=0; i< arr.length; i++){
            if(arr[i]!=0){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        AddMethodTest addMethodTest = new AddMethodTest();
        addMethodTest.add(5);
        System.out.println(addMethodTest.size());
        addMethodTest.add(1);
        System.out.println(addMethodTest.size());

    }
}
