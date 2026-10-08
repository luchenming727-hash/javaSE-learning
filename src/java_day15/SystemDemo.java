package java_day15;

public class SystemDemo {
    static void main() {
        /*
            public static void exit(int status)                终止当前运行的 Java 虚拟机
            public static long currentTimeMillis()             返回当前系统的时间毫秒值形式
            public static void arraycopy(数据源数组, 起始索引, 目的地数组, 起始索引, 拷贝个数)    数组拷贝
        */

        //1.exit，终止当前运行的Java虚拟机
        //方法的形参：它是一个状态码，0表示当前虚拟机是正常停止；非0表示当前虚拟机异常停止
        //System.exit(0);
        System.out.println("看看我执行了吗？");//未执行

        //2.currentTimeMillis()
        //这个方法是表示从时间原点开始，到运行这段代码的时候，所间隔的时间（以毫秒为单位）
        long l = System.currentTimeMillis();
        System.out.println(l);
        //那这个代码有什么用处呢？用处就是计算某一部分代码运行所需要的时间
        //在代码开始之前写：long start = System.currentTimeMillis();
        //在代码结束的时候写：long end = System.currentTimeMillis();


        //3.拷贝数组（引用数据类型也可以使用）
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        int[] arr2=new int[10];
        //把arr1数组中的数据拷贝到arr2中
        //参数一：数据源，要拷贝的数据从哪个数组而来
        //参数二：从数据源数组中的第几个索引开始拷贝
        //参数三：目的地，我要把数据拷贝到哪个数组中
        //参数四：目的地数组的索引。
        //参数五：拷贝的个数
        System.arraycopy(arr1, 0, arr2, 0, 10);

        //验证
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");

        }



    }

}
