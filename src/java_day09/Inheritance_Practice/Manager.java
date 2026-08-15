package java_day09.Inheritance_Practice;

public class Manager extends Employee{
    private double bouns;

    public Manager(String name, String id, double salary, double bouns) {
        super(name, id, salary);
        this.bouns = bouns;
    }

    //自动生成的这个改一改，改成空参构造
//    public Manager(double bouns) {
//        this.bouns = bouns;
//    }
    public Manager() {

    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }

}
