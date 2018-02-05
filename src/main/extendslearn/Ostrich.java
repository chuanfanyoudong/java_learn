package main.extendslearn;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created on 2018/1/29
 *
 * @author jiangzhenkang
 */
public class Ostrich extends Bird{
    public String name = "Ostrich";
    public void fly(){
        System.out.println( "我是"+name+",我只能跑，Sad!" );
    }
    public void callOverrideMethod(){
        super.fly();
    }


    public static void main(String[] args) {
        Ostrich os = new Ostrich();
        os.fly();
        os.callOverrideMethod();
    }
}

