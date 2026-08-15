package java_day04;

public class StringBuilder_practice {
    static void main() {
        //创建StringBuilder类

        StringBuilder sb=new StringBuilder();
        System.out.println(sb);//是空，但是我们之前说new出来的应该都是地址才对
        //是因为
        //因为StringBuilder是Java已经写好的类
        //Java在底层对他做了一些特殊处理
        //打印对象不是地址值而是属性值

        //1.添加
        sb.append("aaa");
        sb.append("abcdef");
        //append可以添加各种类型，int double string都可以

        //2.反转
        sb.reverse();
        //如：abc  反转为:cba

        //3.获取长度
        int len=sb.length();
        System.out.println(len);

        //把StringBuilder类变回字符串
        String str=sb.toString();
        System.out.println(str);
    }
}
