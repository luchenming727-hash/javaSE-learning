package java_day13;
//成员内部类
public class Out_Member_Inner_Class {
    class Inner{
        public void show(){
            System.out.println("我是成员内部类的show方法");
        }
    }
    public void testInner(){
       Inner in=new Inner();
       in.show();
    }

    static void main() {
        Out_Member_Inner_Class ou=new Out_Member_Inner_Class();
        ou.testInner();
        Out_Member_Inner_Class.Inner inner=new Out_Member_Inner_Class().new Inner();
        inner.show();
    }
}
