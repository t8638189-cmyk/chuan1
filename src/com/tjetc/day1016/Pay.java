package com.tjetc.day1016;

import java.util.Scanner;

public class Pay {
    public static void main(String[] args) {
        System.out.println("请输入折扣");
        int txu=245;
        int xie=570;
        int pai=320;
        Scanner sc = new Scanner(System.in);
        double discount = sc.nextDouble();
        System.out.println("T恤价格低于100吗"+(txu*discount<100?"true":"false"));
        System.out.println("衬衫价格低于100吗"+(xie*discount<100?"true":"false"));
        System.out.println("裤子价格低于100吗"+(pai*discount<100?"true":"false"));
    }
}
