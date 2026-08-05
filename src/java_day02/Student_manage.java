package java_day02;

import java.util.Scanner;

public class Student_manage {
    static void main() {
        Student [] std=new Student[4];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i< std.length;i++)
        {
            Student c=new Student();
            System.out.println("请输入学生姓名");
            String name=sc.next();
            c.setName(name);
            System.out.println("请输入学生年龄");
            int age=sc.nextInt();
            c.setAge(age);
            System.out.println("请输入学生性别");
            String gender=sc.next();
            c.setGender(gender);
            System.out.println("请输入学生成绩");
            int score=sc.nextInt();
            c.setScore(score);
            std[i]=c;
            sum+=c.getScore();
        }
        int ave=sum/ std.length;
        int art=0;
        for(int i=0;i< std.length;i++)
        {
            Student std1=std[i];
            if(std1.getScore()>ave)
            {
                art=art+1;
                System.out.println("姓名："+std1.getName()+"年龄"+std1.getAge()+"性别"+std1.getGender()+"成绩"+std1.getScore());

            }

        }
        System.out.println("高于平均分的人有"+art+"个人");
    }
}
