package java_day02;

import java.util.Scanner;

public class CarTest {
    static void main() {
        //创建数组空间用于存放内容
        Car [] arr=new Car[3];
        //确认键盘输入
        Scanner sc=new Scanner(System.in);
        for(int i=0;i< arr.length;i++)
        {
            Car c=new Car();
            System.out.println("请输入汽车品牌：");
            String brand=sc.next();
            c.setBrand(brand);
            System.out.println("请输入汽车价格：");
            double price=sc.nextDouble();
            c.setPrice(price);
            System.out.println("请输入汽车颜色：");
            String color=sc.next();
            c.setColor(color);
            arr[i]=c;

        }
        for(int i=0;i< arr.length;i++)
        {
            Car model=new Car();
            model=arr[i];
            System.out.println(
                    "车的品牌是："+model.getBrand()+
                    "车的价格是："+model.getPrice()+
                    "车的颜色是："+model.getColor());



        }
    }
}
