package com.tjetc.day1016;

import java.util.Scanner;

public class T06_Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //next():返回字符串 遇到空格或换行符结束
        System.out.print("请输入一个字符串:");
        String str=sc.next();
        System.out.println(str);
        //nextLine():返回字符串 遇到换行符结束
        String str1=sc.nextLine();
        System.out.println(str1);
        //nextxxx():接受各种不同的数据类型的数据
    }
}
