package com.geeks.ds;

class MultipleMain {

    public static void main(String[] args) {
        System.out.println("1111");
    }

}

class MultipleMain2 {
    public static void main(String[] args) {
        System.out.println("11111");
        MultipleMain.main(args);
    }
}
