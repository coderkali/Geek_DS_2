package com.geeks.ds;

public class DataTypeTest {

     void getData(byte a, double z){
        double d = (short)a/z*10;
    }
}


class Xyz extends DataTypeTest{

     void getData(byte a, double z){
        double d=  (short)a/z*10;
    }

}