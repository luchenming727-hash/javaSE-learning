package java_day06;
/*
 * 需求：
 * 1. 定义Javabean类：Phone
 *    Phone属性：品牌，价格。
 * 2. main方法中定义一个集合，存入三个手机对象。
 *    分别为：小米，1000。苹果，8000。锤子，2999。
 * 3. 定义一个方法，将价格低于3000的手机信息返回。
 */
public class Phone {
    private String brand;
    private int money;

    public Phone(String brand, int money) {
        this.brand = brand;
        this.money = money;
    }

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
