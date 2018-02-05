package main.polymorphism;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created on 2018/1/30
 *
 * @author jiangzhenkang
 */
public class Instanceof {
    public static void main(String[] args) {
        Object hello = "hello";
        System.out.println( "字符串是否是Object的子类" + (hello instanceof Object) );
        System.out.println( "字符串是否是String的子类" + (hello instanceof String) );
        System.out.println( "字符串是否是Math的子类" + (hello instanceof Math) );
        System.out.println( "字符串是否是Comparable的子类" + (hello instanceof Comparable) );
    }

}
