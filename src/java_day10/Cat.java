package java_day10;

public class Cat extends Animal{
    /*
    	2.定义猫类
		属性：
			年龄，颜色
		行为:
			eat(String something)方法(something表示吃的东西)
			3岁的灰颜色的猫眯着眼睛侧着头吃鱼
			逮老鼠catchMouse方法(无参数)
     */
    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }

    @Override
    public void eat(String sth) {
        System.out.println(this.getAge()+"岁的"+this.getColor()+"颜色的猫咪侧着头吃"+sth);
    }
    public void catchMouse(){
        System.out.println("猫在捉老鼠");
    }
}
