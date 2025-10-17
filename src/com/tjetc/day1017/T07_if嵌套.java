package com.tjetc.day1017;

import java.util.Scanner;

public class T07_if嵌套 {
    public static void main(String[] args) {
        //普通顾客购物满100元打9折；会员购物打8折；会员购物满200元打7.5折
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入是否是会员");
        int vip=sc.nextInt();//1是会员 0不是会员
        System.out.println("请输入购物金额:");
        double money=sc.nextDouble(); //购物金额
        if (vip==1)//会员
        {
            if (money>=200)
            {
                System.out.println("会员满200元打7.5折");
            }
            else
            {
                System.out.println("会员购物打8折");
            }
        }
        else//普通顾客
        {
            if (money>=100)
            {
                System.out.println("普通顾客满100元打9折");
            }
            else
            {
                System.out.println("普通顾客购物不打折");
            }
        }
    }
}
