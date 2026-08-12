package java_day08.Inheritance_Practice;

public class Test_Demo {
    static void main() {
        RagDoll ragDoll=new RagDoll();
        Husky husky=new Husky();
        ragDoll.Catchmouse();
        ragDoll.drink();
        ragDoll.eat();
        System.out.println("-----------------------------------------");
        husky.messup();
        husky.drink();
        husky.Look();
    }
}
