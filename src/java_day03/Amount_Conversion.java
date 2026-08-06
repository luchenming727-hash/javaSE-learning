package java_day03;
//人民币大写金额转换（固定 7 位）
//
//        【题目要求】
//
//        输入校验：键盘输入一个 0 ~ 9999999 的金额，若不在此范围则提示重新输入。
//
//        大写补位：将数字转为大写（零~玖）；若不足 7 位，在前面补“零”凑满 7 位。
//
//        结合单位：按顺序匹配单位 ["佰", "拾", "万", "仟", "佰", "拾", "元"] 并拼接输出。
//
//        【示例】
//
//        输入：2135
//
//        输出：零佰零拾零万贰仟壹佰叁拾伍元

import java.util.Scanner;

public class Amount_Conversion {
    public static void main(String[] args) {
        int money;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入金额：");
        while(true)
        {
            money=sc.nextInt();
            if(money>=0&&money<=9999999)
            {
                break;
            }
            System.out.println("输入错误，请重新输入");
        }
        String moneystr="";
        while(money>0)
        {
            int now=money%10;
            String ret=getCapitalNumber(now);
            moneystr=ret+moneystr;
            money=money/10;
        }

        int t;
        t=moneystr.length();
        while(t<7)
        {
            String cr="零";
            moneystr=cr+moneystr;
            t++;
        }
    String [] arr={"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < 7; i++) {
            char ans1=moneystr.charAt(i);
            System.out.print(ans1);
            System.out.print(arr[i]);

        }








    }

    public static String getCapitalNumber(int a) {
        String[] str = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return str[a];
    }
}
