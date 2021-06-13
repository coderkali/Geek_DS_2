package com.geeks.ds;

class ExampleTest extends Thread {

      ExampleTest(){
          System.out.println("Example");
      }

      public void run(String s){
          System.out.println("baz");
      }

      public void run(){
          System.out.println("bar");
      }


}

class Test1267 {
    public static void main(String[] args) {
        ExampleTest t = new ExampleTest(){
            @Override
            public void run() {
                System.out.println("foo");
            }
        };
        t.start();
        Test1267 t1 = new Test1267();
        t1.test("111");

    }

    public static void main(int[] args) {
        System.out.println("qqqq");
    }

    public void test(String str){
        String strr =null;
        System.out.println(String.valueOf(strr).equalsIgnoreCase("test"));


//        if(String.valueOf(str).equalsIgnoreCase("test")){
//            System.out.println("sssss");
//        }
    }


}

class Test5555{

}
