package java_day13;

interface Say{
    public abstract void sayHello();
}
public class Out_Static_Inner_Class {
    static class staticlnner{
        public void staticShow(){
            System.out.println("这是静态内部类的方法");
        }
    }
    public void useAnonymous(){
        new Say(){
            @Override
            public void sayHello() {
                System.out.println("匿名内部类执行sayHello");
            }
        }.sayHello();
    }

    static void main() {
        //直接创建静态内部类对象，调用staticShow()
        Out_Static_Inner_Class.staticlnner in=new Out_Static_Inner_Class.staticlnner();
        in.staticShow();

        //创建外部类对象，调用useAnonymous()
        Out_Static_Inner_Class ou=new Out_Static_Inner_Class();
        ou.useAnonymous();
    }
}
