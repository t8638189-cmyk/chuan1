package com.tjetc.day1016;

import java.util.Scanner;

public class T10_布尔运算符 {
        public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
            System.out.println("请输入张三的成绩:");
            int zhangsan=sc.nextInt();
             System.out.println("请输入李四的成绩:");
            int lisi=sc.nextInt();
            boolean isBig=zhangsan>lisi;
            System.out.println("张三的成绩是否大于李四的成绩:"+isBig);
        }
}
