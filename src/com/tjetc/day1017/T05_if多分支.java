package com.tjetc.day1017;

import java.util.Scanner;

public class T05_if多分支 {
    public static void main(String[] args)
    {
      //示例:键盘录入一个星期数，输出对应的星期一，星期二。。。
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个星期数:");
        int i=sc.nextInt();
        if (i==1)
        {
            System.out.println("星期一");
        }
        else if (i==2)
        {
            System.out.println("星期二");
        }
        else if (i==3)
        {
            System.out.println("星期三");
        }
        else if (i==4)
        {
            System.out.println("星期四");
        }
        else if (i==5)
        {
            System.out.println("星期五");
        }
        else if (i==6)
        {
            System.out.println("星期六");
        }
        else if (i==7)
        {
            System.out.println("星期日");
        }
        else
        {
            System.out.println("输入错误");
        }
    }
}
