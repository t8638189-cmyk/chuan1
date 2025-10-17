package com.tjetc.day1017;

import java.util.Scanner;

public class T02_if语句 {
    public static void main(String[] args)
    {
        //单分支:if(关系表达式){语句体}
        //小明考试成绩是100分，他妈妈就会给他买一个游戏机 否则打他一顿
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入小明的成绩:");
        int score=sc.nextInt();
        if(score==100)
        {
            System.out.println("他妈妈会给他买一个游戏机");
        }
        else
        {
            System.out.println("打他一顿");
        }
    }
}
