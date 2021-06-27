package com.geeks.ds;

import java.util.ArrayList;
import java.util.List;

public class SlowestKeyPress {

    public static char slowestKey(List<List<Integer>> keyTimes)
    {
        // Let create 3 different arrays for storing characters,
        // times duration on keys pressed and the
        // difference of the time duration results
        int[] charArr = new int[keyTimes.size()];
        int[] timePressedArr = new int[keyTimes.size()];
        int[] resultArray = new int[keyTimes.size()];
        // Just a normal index to fill elements at the respective array location
        int i = 0;
        //Fill the charArr and timePressedArr
        for (List<Integer> list : keyTimes)
        {
            if (1 < keyTimes.size()) {
                charArr[i] = list.get(0);
                timePressedArr[i] = list.get(1);
            }
            i++;
        }
        //Calculate the maximum duration for which key was pressed
        int maxGap = timePressedArr[0];
        //Since we start the for loop from index 1 ew need to manually assign the value of the first character
        //Also note that the array are in sorted format so the element at index 0 will always be lesser
        resultArray[0] = timePressedArr[0];
        for (int index = 1; index < timePressedArr.length; index++)
        {
            maxGap = Math.max(maxGap, timePressedArr[index] - timePressedArr[index - 1]);
            resultArray[index] = Math.max(maxGap, timePressedArr[index] - timePressedArr[index - 1]);
        }
        System.out.println("Maximum element found: " + maxGap);
        //use Binary search to find out the index of the maximum element
        int indexForMaximumElement = binarySearch(resultArray, 0, resultArray.length - 1, maxGap);
        System.out.println("Index found at:" + indexForMaximumElement);

        //If the list obtained is empty return
        if (timePressedArr == null || timePressedArr.length < 1)
        {
            return 0;
        }
        //Since 1 is ascii dosent hold any CHAR value for return add 96 to index
        //This way you will be able to return the ASCII representation for 1-25(a-z)
        System.out.println((charArr[indexForMaximumElement] + 96));
        char ch = ((char) (charArr[indexForMaximumElement] + 96));

        System.out.println("Longest pressed character found " + ch);
        return ch;
    }

    public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(0);
        list1.add(3);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(4);
        list2.add(5);
        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(4);
        list3.add(10);

        List<List<Integer>> keyTimes = new ArrayList<List<Integer>>();
        keyTimes.add(list);
        keyTimes.add(list1);
        keyTimes.add(list2);
        keyTimes.add(list3);

        System.out.println(slowestKey(keyTimes));
    }
}
