package java_day04;

import java.util.Scanner;

public class Valid_Palindrome {
    //验证回文串
    //需求：键盘输入一个字符串，程序判断出该字符串是否为对称字符串，并在控制台打印是或者不是
    public static void main() {
        //1.键盘录入字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String str=sc.next();

        //2.反转从键盘录入的字符串
        StringBuilder sb=new StringBuilder();
        sb.append(str).reverse();
        String result=sb.toString();
        if(str.equals(result))
        {
            System.out.println("是");
        }
        else
        {
            System.out.println("否");
        }


    }
}
