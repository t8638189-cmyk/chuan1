package com.tjetc.day1016;

import java.util.Scanner;

public class T04_强制类型转换 {
        public static void main(String[] args) {

            //大转小 强制转 语法: 小类型 变量=(小类型) 大类型变量或数 会有数据溢出
                int a=129;
                byte b=(byte)a;
                System.out.println(b);

           /*     案例:实现一个数字加密器，加密规则是
                加密结果 = （整数 * 10 + 5）/ 2 + 3.14159
                加密结果仍为一整数*/
           Scanner sc=new Scanner(System.in);
                System.out.println("请输入一个整数:");
                //接收输入的整数
                int i=sc.nextInt();
                //加密结果
                int result= (int) ((i*10+5)/2+3.14159);
                System.out.println("加密结果为:"+result);

        }
}
