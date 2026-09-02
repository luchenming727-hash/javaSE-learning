package java_day12;

public class PingPongplayer extends Player implements English{
    public PingPongplayer() {
    }

    public PingPongplayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void Speak() {
        System.out.println("乒乓球运动员"+this.getName()+"在说英语");
    }

    @Override
    public void play() {
        System.out.println("乒乓球运动员"+this.getName()+"在训练");

    }
}
