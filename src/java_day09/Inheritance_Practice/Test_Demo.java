package java_day09.Inheritance_Practice;

public class Test_Demo {
    static void main() {
        Cook cook=new Cook();
        Manager m=new Manager("15456","zhangsan",15000,700);
        cook.work();
        cook.eat();
        System.out.println("------------------");
        m.work();
        double t=m.getBouns();
        System.out.println(t);
        m.eat();
    }
}
