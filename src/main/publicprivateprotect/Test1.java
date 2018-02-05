package main.publicprivateprotect;

/**
 * Created on 2018/1/29
 *
 * @author jiangzhenkang
 */
public class Test1 {
    private int age;
    String name;
    protected  int inhight;
    public Test1(int age,int inhight,String name){
        this.age = age;
        this.inhight = inhight;
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Test1 a = new Test1(5,174,"Paul Jarge");
        System.out.println( a.name );
    }
}

