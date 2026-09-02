package java_day12;

public class PingpongCoach extends Coach implements English{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练"+this.getName()+"在教打乒乓球");
    }

    @Override
    public void Speak() {
        System.out.println("乒乓球教练"+this.getName()+"在说英语");
    }
}
