package com.tjetc.day1016;

public class T05_算术运算符 {
    public static void main(String[] args) {
        //+ - * / %
        int a=13;
        int b=5;
    /*    System.out.println(a+b); //18
        System.out.println(a-b); //8
        System.out.println(a*b); //65
        System.out.println(a/b); //2
        System.out.println(a%b); //3*/
        int c=a++ + ++b + ++a +--b +a--;
        System.out.println(c);
    }
}
