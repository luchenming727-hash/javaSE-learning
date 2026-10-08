package java_day15;

public class MathDemo {
    static void main() {
        /*
        public static int      abs(int a)           获取参数绝对值
        public static double   ceil(double a)       向上取整
        public static double   floor(double a)      向下取整
        public static int      round(float a)       四舍五入
        public static int      max(int a,int b)     获取两个int值中的较大值
        public static double   pow(double a,double b) 返回a的b次幂的值
        public static double   sqrt(double a)       返回a的平方根
        public static double   cbrt(double a)       返回a的立方根
        public static double   random()             返回值为double的随机值，范围[0.0,1.0)
        */


        //abs获得参数绝对值
        System.out.println(Math.abs(88));//88
        System.out.println(Math.abs(-88));//88
        /*以int类型为例子，取值范围在：-2147483648 ~ 2147483647之间
        如果没有正数与负数对应，那么传递负数结果有误
        -2147483648没有正数与其相对应，所以abs结果就会产生bug
         */

        //进一法：往数轴的正方向进一位
        System.out.println(Math.ceil(12.34));//13.0
        System.out.println(Math.ceil(12.54));//13.0
        System.out.println(Math.ceil(-12.34));//-12.0
        System.out.println(Math.ceil(-12.54));//-12.0
        System.out.println("----------------------------");
        //去尾法：往数轴负方向退一位
        System.out.println(Math.floor(12.34));//12.0
        System.out.println(Math.floor(12.54));//12.0
        System.out.println(Math.floor(-12.34));//-13.0
        System.out.println(Math.floor(-12.54));//-13.0
        System.out.println("----------------------------");
        //四舍五入法：(产生是int类型）
        System.out.println(Math.round(12.34));//12
        System.out.println(Math.round(12.54));//13
        System.out.println(Math.round(-12.34));//-12
        System.out.println(Math.round(-12.54));//-13
        //获取两个数的较大值
        System.out.println(Math.max(20,30));//30
        //获取两个证书的较小值
        System.out.println(Math.min(20,30));//20
        //获取a的b次幂(b我们一般都写大于等于1的正整数）
        System.out.println(Math.pow(2,3));//8
        System.out.println("----------------------------");
        //random产生随机数
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.floor(Math.random() * 100) + 1);
            //Math.random()  [0.0  1.0)
            //* 100          [0.0  100.0)
            //floor          去掉了后面的小数
            //+1             [1  100.0]
        }


    }
}
