package java_day10;

public class Dog extends Animal{
    /*1.定义狗类
		属性：
			年龄，颜色
		行为:
			eat(String something)(something表示吃的东西)
			看家lookHome方法(无参数)

     */

    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }

    @Override
    public void eat(String sth) {
        System.out.println(this.getAge()+"岁"+this.getColor()+"颜色的狗抱着"+sth+"猛吃");
    }
    public void lookinghome(){
        System.out.println("狗在看家");
    }
}
