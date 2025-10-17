package com.tjetc.day1017;

import java.util.Scanner;

public class T06_if多分支案例 {
    public static void main(String[] args) {
        //小明考试礼物:95-100 炸弹   90-94 原子弹  80-89:飞机 否则暴揍一顿
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入小明的成绩:");
        int score=sc.nextInt();
        if (score>=95)
        {
            System.out.println("小明获得了炸弹");
        }
        else if (score>=90)
        {
            System.out.println("小明获得了原子弹");
        }
        else if (score>=80)
        {
            System.out.println("小明获得了飞机");
        }
        else
        {
            System.out.println("小明被暴揍了一顿");
        }
    }
}
