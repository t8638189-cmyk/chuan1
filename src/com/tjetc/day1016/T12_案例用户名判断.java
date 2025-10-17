package com.tjetc.day1016;

import java.util.Scanner;

public class T12_案例用户名判断 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入用户名:");
            String username=sc.nextLine();
            System.out.println("请输入密码:");
            String password=sc.nextLine();
            //判断是否输入
            if (username.isEmpty() || password.isEmpty()){
                System.out.println("用户名或密码不能为空");
            }
            else{
                System.out.println("登录成功");
            }
        }
}
