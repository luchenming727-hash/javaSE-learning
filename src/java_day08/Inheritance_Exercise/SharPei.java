package java_day08.Inheritance_Exercise;

public class SharPei extends Dog{
    //父类中的方法不能满足子类的需求了，需要重写
    @Override
    public void eat() {
        super.eat();
        System.out.println("吃骨头");
    }
}
