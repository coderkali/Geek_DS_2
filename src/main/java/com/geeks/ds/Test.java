package com.geeks.ds;

 class Test123444445 {

      public int index=1;

      public void print(){
          System.out.println(index);
      }

}

class app extends Test123444445 {

     public app(int data){
         //index= data;
     }

     //Test123444445 t = new app(123);


     public void print(){
         System.out.println(index);
     }

    public static void main(String[] args) {
        app a = new app(10);
        //app a2 =  new Test123444445();

        a.print();

    }



}
