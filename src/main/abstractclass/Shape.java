package main.abstractclass;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Created on 2018/2/5
 *
 * @author jiangzhenkang
 */
public abstract class Shape {
    protected static String a = "5";
    {
        System.out.println("执行Shape的初始化块");
    }
    public String color;
    public abstract double calPerimeter();
    public abstract String getType();
    public  String getColor(){
     return this.color;
    }

    public Shape(String color){
        this.color = color;
    }
}
