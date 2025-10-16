package com.tjetc.day1016;
import java.util.Scanner;
public class T07_Scanner_anlier {
    public static void main(String[] args) {
        System.out.println("请输入java的成绩:");
        Scanner scanner=new Scanner(System.in);
        double java=scanner.nextDouble();
        System.out.println("请输入sql的成绩:");
        double sql=scanner.nextDouble();
        System.out.println("请输入html的成绩:");
        double html=scanner.nextDouble();
        double cha=java-sql;
        double avg=(java+sql+html)/3;
        System.out.println("java\tsql\thtml");
        System.out.println(java+"\t"+sql+"\t"+html);
        System.out.println("java和sql的成绩差:"+cha);
        System.out.println("三门成绩的平均分:"+avg);
    }
}
