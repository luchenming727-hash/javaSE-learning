package java_day12;

import java.util.Scanner;

public class Test {
    static void main() {
        PingPongplayer ppr=new PingPongplayer("刘诗雯",23);
        System.out.println(ppr.getName()+","+ppr.getAge());
        ppr.play();
        ppr.Speak();
        PingpongCoach ppc=new PingpongCoach();
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入乒乓球教练的姓名和年龄");
        ppc.setName(sc.next());
        ppc.setAge(sc.nextInt());
        System.out.println(ppc.getName()+","+ppc.getAge());
        ppc.Speak();
        ppc.teach();
    }
}
