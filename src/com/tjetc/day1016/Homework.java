package com.tjetc.day1016;

import java.util.Scanner;

public class Homework {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int numn=num<0?-num:num;
        System.out.println(numn);
    }

}
