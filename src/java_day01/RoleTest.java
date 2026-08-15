package java_day01;

public class RoleTest {
    public static void main() {

        // 为 r1 和 r2 初始化不同的名字和血量
        Role r1 = new Role("乔峰", 100,'男');
        Role r2 = new Role("慕容复", 100,'女');
        r1.showInfo();
        r2.showInfo();

        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                break;
            }
        }
    }
}
