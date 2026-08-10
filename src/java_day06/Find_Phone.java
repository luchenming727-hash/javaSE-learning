package java_day06;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 需求：
 * 1. 定义Javabean类：Phone
 *    Phone属性：品牌，价格。
 * 2. main方法中定义一个集合，存入三个手机对象。
 *    分别为：小米，1000。苹果，8000。锤子，2999。
 * 3. 定义一个方法，将价格低于3000的手机信息返回。
 */
public class Find_Phone {
    static void main() {
        ArrayList<Phone> list=new ArrayList<>();
        Phone p1=new Phone("xiaomi",1999);
        Phone p2=new Phone("iphone",5999);
        Phone p3=new Phone("honor",2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        int money;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入筛选最高价格");
        money=sc.nextInt();
        ArrayList<Phone> result=check(list,money);
        System.out.println("低于筛选价格的有：");
        for (int i = 0; i < result.size(); i++) {
            Phone p=result.get(i);
            System.out.printf("品牌%s,价格：%d\n",p.getBrand(),p.getMoney());

        }
    }
    public static ArrayList<Phone> check(ArrayList<Phone> list ,int money)
    {
        ArrayList<Phone> result=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int cost=list.get(i).getMoney();
            if(cost<money)
            {
                result.add(list.get(i));
            }
        }
        return result;
    }
}
