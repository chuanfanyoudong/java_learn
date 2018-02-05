package main.abstractclass;

import com.sun.deploy.nativesandbox.NativeSandboxBroker;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created on 2018/2/5
 *
 * @author jiangzhenkang
 */
public class Circle extends Shape{
    private double radius;
    public Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double calPerimeter() {
        return 2*Math.PI* radius;
    }
    @Override
    public String getType() {
        return getColor() + "圆形";

    }
    public static String ac(){
//        return this.color;
        return Circle.a;
    }


    public static void main(String[] args) {
        Shape s1 = new Triangle( "黑色",3,4,5 );
        Shape s2 = new Circle( "黄色",3 );
        System.out.println(s1.getType());
        System.out.println(s1.calPerimeter());
        System.out.println(s2.getType());
        System.out.println(s2.calPerimeter());
        System.out.println(Shape.a);
    }
}
