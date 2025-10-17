package com.tjetc.day1016;

public class T11_与或非 {
        public static void main(String[] args) {
            int a=1;
            int b=2;
            boolean result=a>5 && b++<3 ;  //短路 b++不会执行 因为a>5为false 直接返回false
            System.out.println("result = " + result);//false
            System.out.println("b = " + b);//2   b没有自增
        }

}
