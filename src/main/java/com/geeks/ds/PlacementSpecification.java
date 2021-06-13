package com.geeks.ds;

public class PlacementSpecification {


    public static int[] placement(int size,int[] arr){
        int[] result = new int[size];
        int count =0;
        result[0] =0;
        for (int i =1; i<size; i++){
            if(i ==1 && arr[1] > arr[0]){
                result[1]=0;
                continue;
            }
            for(int j =1; j<size; j++) {
               if(arr[j] > arr[i]){
                  count++;
               }
//               else{
//                   result[i] = ++count;
//                   break;
//               }
            }
            result[i] = count;

        }


        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {4 , 9 , 5 , 3 , 2 , 10};
        int size =numbers.length;
        System.out.println(placement(size,numbers));
    }

}
