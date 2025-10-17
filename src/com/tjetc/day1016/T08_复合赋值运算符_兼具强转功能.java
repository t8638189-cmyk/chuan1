package com.tjetc.day1016;

public class T08_复合赋值运算符_兼具强转功能 {
    public static void main(String[] args){
        short s=10;
        //对s+5   s=s+5会报错  因为s+5的结果是int类型，而s是short类型，会丢失精度 但是+=运算符会自动强转
        s+=5;

        System.out.println(s);
    }
}
