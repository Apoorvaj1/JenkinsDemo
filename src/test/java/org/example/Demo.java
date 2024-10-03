package org.example;

import org.testng.annotations.Test;

public class Demo extends Demo1 {

    int a = 100;
   public Demo(){
       System.out.println("Hello");
   }

   public Demo(int a){
       this();
       System.out.println(this.a);
       System.out.println(super.a);
       System.out.println("Hello "+a);
   }


    public static void main(String[] args) {

       Demo a = new Demo(10);
    }
}
