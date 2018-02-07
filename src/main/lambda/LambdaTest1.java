package main.lambda;

/**
 * Created on 2018/2/7
 *
 * @author jiangzhenkang
 */
interface MyTest{
    String test(String a, int b, int c);
}
public class LambdaTest1 {
    public static void main(String[] args) {
//        MyTest mt = (a,b,c) -> a.substring( b,c );
        MyTest mt = String::substring;
        String str = mt.test( "Java I Love you",2,9 );
        System.out.println(str);
    }
}
