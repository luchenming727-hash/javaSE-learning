package java_day06;
/*
 * 需求：
 * 1. main方法中定义一个集合，存入三个用户对象。
 *    用户属性为：id, username, password
 * 2. 要求：定义一个方法，根据id查找对应的用户信息。
 *    如果存在，返回true
 *    如果不存在，返回false
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Find_User {

    static void main() {
        //1.创建集合
        ArrayList<User> list=new ArrayList<>();
        User u1=new User("123","zhangsan","123456");
        User u2=new User("456","lisi","258369");
        User u3=new User("789","wangwu","147258");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户ID");
        String id= sc.next();
        boolean result=check(list,id);
        System.out.println(result);
        User u=findUser(list,id);
        if(u!=null)
        {
            System.out.println("查找成功,ID为："+u.getID()+",用户名为："+u.getUsername());
        }


    }
    public static boolean check(ArrayList<User> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getID().equals(id)) {
                return true;
            }
        }
        return false;
    }
    public static User findUser(ArrayList<User> list ,String id)
    {
        for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            if(u.getID().equals(id)) {
                return u;
            }
        }
        return null;
    }
}
