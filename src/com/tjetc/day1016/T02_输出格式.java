package com.tjetc.day1016;

public class T02_输出格式 {
        public static void main(String[] args) {
            //输出格式:
            //%s:字符串
            //%d:整数
            //%f:浮点数
            //
//            System.out.printf("姓名:%s,年龄:%d,成绩:%.2f", "张三", 18, 90.5111);

            String str=String.format("姓名:%s,年龄:%d,成绩:%.2f", "张三", 18, 90.5111);
            //默认不换行,换行可以使用\n
            System.out.println(str);
        }
}
