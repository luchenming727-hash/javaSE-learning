package java_day05;

import java.util.Scanner;

//给定两个字符串，A 和 B。
//
//A 的旋转操作就是将 A 最左边的字符移动到最右边。
//
//例如，若 A = 'abcde', 在移动一次之后结果就是 'bcdea'。
//
//如果在若干次调整操作之后，A 能变成 B，那么返回 True。
//
//如果不能匹配成功，则返回 false


public class Rotate_String {
    static void main() {
        System.out.println("请输入第一个字符串A");
        String str1=new String();
        Scanner sc=new Scanner(System.in);
        str1= sc.next();
        System.out.println("请输入第二个字符串B");
        String str2=new String();
        Scanner sc1=new Scanner(System.in);
        str2=sc1.next();
        boolean result=check(str1,str2);
        System.out.println(result);

    }
    public static String rotate(String str){
        //方法1：用subString进行截取，把左边的字符截取出来拼接到右侧去
        char c=str.charAt(0);
        String end=str.substring(1);
        return end+c;
    }
    public static boolean check(String strA,String strB)
    {
        for (int i = 0; i < strA.length(); i++) {
            strA=rotate1(strA);
            if(strB.equals(strA)) {
                return true;
            }
        }
        return false;
    }
    //方法2：改成字符数组再调整
    public static String rotate1(String str)
    {
        char[] arr=str.toCharArray();
        char first=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
        String str1=new String(arr);
        return str1;
    }
}
