package com.tjetc.day1017;

import java.util.Scanner;

public class T09_switch案例 {
    public static void main(String[] args) {
      ////输入月份,输出对应的季节
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月份");
        int month=sc.nextInt();
        switch (month){
            case 1://1月,2月,12月
            case 2:
            case 12:
                System.out.println("冬季");
                break;//跳出switch
            case 3://3月,4月,5月
            case 4:
            case 5:
                System.out.println("春季");
                break;//跳出switch
            case 6://6月,7月,8月
            case 7:
            case 8:
                System.out.println("夏季");
                break;//跳出switch
            case 9://9月,10月,11月
            case 10:
            case 11:
                System.out.println("秋季");
                break;//跳出switch
            default://默认
                System.out.println("输入错误");
        }//switch
    }
}
