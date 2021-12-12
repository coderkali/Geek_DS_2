package com.geeks.ds;

public class IKMTest123 {

    private static int count;
    static {
        System.out.println("In Block 1");
        count =10;
    }

    private int[] data;
    {
        System.out.println("In Block 2");
        data = new int[count];
        for(int i =0; i<count; i++){
            data[i] = i;
        }
    }

    public static void main(String[] args) {
        System.out.println("Count ="+count);
        System.out.println("Before 1st call to new");
        IKMTest123 i = new IKMTest123();
        System.out.println("Before 2nd call to new");
        IKMTest123 i2 = new IKMTest123();
    }
}
