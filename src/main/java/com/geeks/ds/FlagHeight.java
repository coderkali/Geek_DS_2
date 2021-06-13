package com.geeks.ds;

public class FlagHeight {

    public static int jumps(int flagHeight, int bigJump){
//        int count =1;
//        while(flagHeight % bigJump >= 1){
//            count++;
//            bigJump++;
//        }
//
//        return count;

        int jumps = flagHeight/bigJump;
        jumps += flagHeight % bigJump;
        return jumps;

    }

    public static void main(String[] args) {
        System.out.println(FlagHeight.jumps(3,1));
    }
}
