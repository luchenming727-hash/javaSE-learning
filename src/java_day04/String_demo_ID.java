package java_day04;

import java.util.Scanner;

public class String_demo_ID {
    static void main() {
        System.out.println("请输入身份证号：");
        Scanner sc=new Scanner(System.in);
        String ID=sc.next();
        String year=ID.substring(6,10);
        String month=ID.substring(10,12);
        String day=ID.substring(12,14);
        System.out.println("您的出生日期为"+year+"年"+month+"月"+day+"日");
    }
}
