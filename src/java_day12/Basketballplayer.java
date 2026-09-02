package java_day12;

public class Basketballplayer extends Player {
    public Basketballplayer() {
    }

    public Basketballplayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("篮球运动员"+this.getName()+"在训练打篮球");

    }
}
