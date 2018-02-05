package main.polymorphism;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created on 2018/1/30
 *
 * @author jiangzhenkang
 */

class BaseClass{
    public static int book = 6;
    public void base(){
        System.out.println( "父类的普通方法" );
    }
    public void test(){
        System.out.println( "父类的被覆盖的方法" );
    }
}
public class SubClass extends BaseClass{
    public static String book = "轻量级Java EE企业级实战";
    public void test(){
        System.out.println("子类覆盖父类的方法");
    }
    public void sub(){
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {
        BaseClass bc = new BaseClass();
        System.out.println(bc.book);
        bc.base();
        bc.test();
        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.base();
        sc.test();
        BaseClass polymorphicBc = new SubClass();
        System.out.println(polymorphicBc.book);
        polymorphicBc.base();
        polymorphicBc.test();
    }
}


