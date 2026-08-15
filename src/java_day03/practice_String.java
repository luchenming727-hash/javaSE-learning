package java_day03;

import java.util.Scanner;

public class practice_String {
    static void main() {
        //创建字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String str=sc.next();
        //创建计数器
        int bignuber=0;
        int smallnumber=0;
        int number=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c>='a'&&c<='z')
            {
                smallnumber++;
            } else if (c>='A'&&c<='Z') {
                bignuber++;

            }
            else if(c>='0'&&c<='9') {
                number++;
            }
        }
        System.out.println("字符串中大写字母出现了"+bignuber+"次,"+"小写字母出现了"+smallnumber+"次,"+"数字字符出现了"+number+"次");

    }
}
