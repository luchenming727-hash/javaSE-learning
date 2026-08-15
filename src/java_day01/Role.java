package java_day01;

import java.util.Random;


public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;
    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};
    public Role(){}

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }
    public void setFace(char gender)
    {
        Random r= new Random();
        if(gender=='男'){
            int i=r.nextInt(boyfaces.length);
            this.face=boyfaces[i];
        }
        else if(gender=='女'){
            int i=r.nextInt(girlfaces.length);
            this.face=girlfaces[i];
        }
        else
        {
            System.out.println("输入性别有误");
        }
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender)
    {
        this.gender=gender;
    }
    public String getFace(){
        return face;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role)
    {
        //计算造成的伤害
        Random r=new Random();
        int hurt=r.nextInt(20)+1;
        //计算剩余血量
        int remainblood=role.getBlood()-hurt;
        // 如果剩余血量小于0，则强制设为0，否则保持不变
        remainblood = (remainblood < 0) ? 0 : remainblood;
        role.setBlood(remainblood);
        System.out.println(this.getName()+"打了"+role.getName()+"造成了"
                +hurt+"点伤害"+role.getName()+"还剩下"+role.getBlood()+"滴血");

    }
    public void showInfo(){
        System.out.println(name);
        System.out.println(blood);
        System.out.println(gender);
        System.out.println(face);

    }
}
