package java_day04;

import java.util.Scanner;

public class String_demo_phone {
    static void main() {
        System.out.println("请输入手机号：");
        Scanner sc=new Scanner(System.in);
        String phone=sc.next();
        //123 1546 4875
        //截取前三位
        String start=phone.substring(0,3);
        //截取到末尾
        String end=phone.substring(7);
        System.out.println(start+"****"+end);
//        String substring(int beginlndex,int endlndex)截取
//                注意点：包头不包尾,包左不包右
//                只有返回值才是截取的小串
//        String substring(int beginlndex)截取到末尾

    }
}
