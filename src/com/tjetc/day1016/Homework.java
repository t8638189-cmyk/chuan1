package com.tjetc.day1016;

public class Homework {

    public static void method1(int a, int b, int c){
              a=-5; b=--a;
              if (a%2==0){
                 a=++b;
              }else {
                  b=--a;
              }
                  System.out.println("a="+a);
                  System.out.println("b="+b);
    }
    public static void method2(int a){
        a=0;
        while (a<=5){
            for (int b = 1; b <=5 ; b++) {
                System.out.print(b+" ");
            }
            System.out.println();
                a++;
        }
    }
    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;
        method1(a,b,c);
        method2(a);
        System.out.println(a+" "+b+" "+c);
    }
}
