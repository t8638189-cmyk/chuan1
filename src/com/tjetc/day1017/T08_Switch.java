package com.tjetc.day1017;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class T08_Switch {
    public static void main(String[] args) {
        //示例:键盘录入一个星期数，输出对应的星期一，星期二。。。
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入星期");
        int day=sc.nextInt();
        switch (day){
            case 1://星期一
                System.out.println("星期一");
                break;//跳出switch
            case 2://星期二
                System.out.println("星期二");
                break;//跳出switch
            case 3://星期三
                System.out.println("星期三");
                break;//跳出switch
            case 4://星期四
                System.out.println("星期四");
                break;//跳出switch
            case 5://星期五
                System.out.println("星期五");
                break;//跳出switch
            case 6://星期六
                System.out.println("星期六");
                break;//跳出switch
            case 7://星期日
                System.out.println("星期日");
                break;//跳出switch
            default://默认
                System.out.println("输入错误");
        }
    }
}
