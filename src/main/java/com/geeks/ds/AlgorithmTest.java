package com.geeks.ds;

public class AlgorithmTest {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 1, 2, 3, 3, 4, 6};
        int x;

        int n = arr.length;
        int i;
        int j =0;
        Integer[] temp = new Integer[100];

        for(i=0; i<n-1; i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
                temp[j++] = arr[n-1];

            }

        }
        for(; j<=i; j++ ){
            arr[i] = temp[i];
        }


        for(Integer ii : temp){
            System.out.print(ii);
        }

    }
}
