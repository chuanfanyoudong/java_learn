package main.polymorphism;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created on 2018/1/30
 *
 * @author jiangzhenkang
 */
public class TypeChange {
    public static void main(String[] args) {
        double d = 1.524;
        long l = (long)d;
        int i = (int)d;
        System.out.println(d);//1.523
        System.out.println(l);//1
        System.out.println(i);//1
        Object object = new Integer( 5 );

        if (object instanceof Object){
            Object str = (Object) object;
            System.out.println(str);
        }
    }
}
