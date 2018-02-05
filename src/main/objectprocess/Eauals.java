package main.objectprocess;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created on 2018/2/1
 *
 * @author jiangzhenkang
 */
public class Eauals {
    public static void main(String[] args) {
        int it = 65;
        float f1 = 65.0f;
        System.out.println( it == f1 );
        char ch = 'A';
        System.out.println( it == ch );
        String str1 = new String( "hello" );
        String str2 = new String( "hello" );
        System.out.println(str1 == str2);
        String STR3 = "HELLO";

    }
}
