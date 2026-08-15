package java_day07;

public class Test_ArrayUtil {
    static void main() {
        //测试工具类中方法是否正确
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        String s = ArrayUtil.printArr(arr);
        System.out.println(s);
        double[] arr2={1.5,2.3,5.6,4.2,5.1,4.5,3.2};
        double aerage = ArrayUtil.getAerage(arr2);
        System.out.println(aerage);

    }
}
