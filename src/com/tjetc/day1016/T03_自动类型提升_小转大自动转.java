package com.tjetc.day1016;

import java.util.Scanner;

public class T03_自动类型提升_小转大自动转 {
        public static void main(String[] args) {
            //自动类型提升:小转大,自动转  最大类型是double
            byte b=10;
            int i=b;
            System.out.println(i);
            Scanner sc=new Scanner(System.in);
           double scc= sc.nextInt();
            System.out.println(scc);

        }

}
