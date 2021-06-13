package com.geeks.ds;

public class SwitchTest {

    public static void main(String[] args) {
        int flag = -1;
        String testStatus;

        switch (flag){
            case 1 : testStatus = "started";
            break;
            case 2 : testStatus = "Running";
                break;
            case 3 : testStatus = "Idle";
                break;
            case 4 : testStatus = "Expired";
                break;
            case 5 : testStatus = "Completed";
            //switch (resultStatus);
        }
    }
}
