package java_day05;

import java.util.ArrayList;

public class Group_Base {
    //集合存储数据类型特点：只能存储引用数据类型，不能存储基本数据类型
    //如果想存储整数，需要转换成相对应的类来存储。
    //如果存储字符，用Character,存储整数，用Integer，首字母都需要大写
    static void main() {
        //泛型：限定集合中存储的类型。ArrayList<泛型>();
        //此时我们创建的是ArrayList的对象，而ArrayList是Java已经写好的一个类
        //这个类在底层已经有处理
        //打印对象不是地址值，而是集合中存储的数据内容
        //在展示的时候会拿[]把所有的数据进行包裹

/*
        // 添加元素，返回值表示是否添加成功
        boolean add(E e);

// 删除指定元素,返回值表示是否删除成功
        boolean remove(Object o);

// 删除指定索引的元素,返回被删除元素
        E remove(int index);

// 修改指定索引下的元素,返回原来的元素
        E set(int index, E element);

// 获取指定索引的元素
        E get(int index);

// 集合的长度，也就是集合中元素的个数
        int size();
*/
        //1.创建集合对象
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        //2.添加元素
        list.add("aaa");//不管添加什么，都是能添加成功，永远返回值为true，所以就不用接收返回值了。
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
/*
        //3.删除元素
        boolean result=list.remove("aaa");
        System.out.println(result);//true
        String str=list.remove(1);
        System.out.println(str);//ccc
*/
        //4.修改元素
        String result=list.set(0,"ccc");
        System.out.println(result);//aaa
        //5.获取集合元素个数，遍历集合
        for (int i = 0; i < list.size(); i++) {
           String str= list.get(i);
            System.out.println(str);
        }



        //1.创建对象
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
    }
}
