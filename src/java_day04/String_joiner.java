package java_day04;

import java.util.StringJoiner;

public class String_joiner {
    static void main() {
        //StringJoiner和StringBuilder一样，也可以看做容器，创建之后里面的内容是可变的
        //作用：提高字符串的操作效率，代码简洁，因为是JDK8以后出现的，所以使用的人少
        //StringJoiner构造方法：
        //public  StringJoiner(间隔符号).说明：创建一个StringJoiner对象，指定拼接时的间隔符号
        //public  StringJoiner(间隔符号,开始符号,结束符号)
        //说明：创建一个StringJoiner对象，指定拼接时的间隔符号，开始符号，结束符号


        //1.创建一个对象，并指定中间的间隔符号
//        StringJoiner sj = new StringJoiner("---");
//
//        //2.添加元素
//        sj.add("aaa").add("bbb");
//
//        //3.打印结果
//        System.out.println(sj);//aaa---bbb

        //1.创建对象
        StringJoiner sj=new StringJoiner("--","{","}");

       //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");
        int len= sj.length();
        System.out.println(len);

       //3.打印
        System.out.println(sj);
        String str=sj.toString();
        System.out.println(str);
    }
}
