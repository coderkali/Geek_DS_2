package com.geeks.ds.hackerrank;




public class OutputTest {

    public static void main(String[] args) {
        try{
            Float f = new Float("3.0");
            int x = f.intValue();
            byte b = f.byteValue();
            double d = f.doubleValue();
            System.out.println(x+b+d);

            String s = "force";
            System.out.println(s.replace("f", "Kf").replace("F", "KF"));
        }catch (NumberFormatException e){
            System.out.println("bad Number");
        }
    }
}
