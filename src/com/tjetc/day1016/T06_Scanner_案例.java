package com.tjetc.day1016;

import java.util.Scanner;

/**
 *请您在键盘输入10个学生的成绩，请计算出总分和平均分，并计算及格和不及格的百分比
 */
public class T06_Scanner_案例 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入10个学生的成绩:");
            int arr[]=new int[10];
            for (int i = 0; i <= 9; i++) {
                arr[i]=sc.nextInt();  //回车 tab 空格可以作为分隔
            }
            for (int i = 0; i <arr.length; i++) {
                System.out.println("第"+(i+1)+"个学生的成绩为:"+arr[i]);
            }
            double sum=0;
            int jige=0; //及格总分数
            for (int i = 0; i <arr.length; i++) {
                sum+=arr[i];
                if (arr[i]>=60){
                   jige++;
                }
            }
            System.out.println("总分:"+sum);
            System.out.println("平均分:"+(sum/arr.length));
            System.out.println("及格率:"+(jige/(double)arr.length));

        }
}
