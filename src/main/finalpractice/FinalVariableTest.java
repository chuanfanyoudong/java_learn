package main.finalpractice;

/**
 * Created on 2018/2/5
 *
 * @author jiangzhenkang
 */
public class FinalVariableTest {
    final int a = 6;
    final String str;
    final int c;
    final static double d;
    //final char ch;因为始终没有对ch赋值。所以会报错，因为final修饰的需要赋值

    //初始化块，可对没有制定默认值的实例变量指定初始值
    {
        str = "Hello";
        //a = 9;不能对a赋值，因为a为final修饰
    }
    static
    {
        //在静态初始化块中对类变量赋值
        d = 5.6;
    }
    public FinalVariableTest(){
        //可以在构造器中对实例变量赋值
        c = 5;
    }
    public void changeFinal(){
        //d = 1.2;普通方法不能为final修饰的成员变量赋值
        //ch = 'a';不能在普通方法中为final成员变量制定初始值
    }

    public static void main(String[] args) {
        FinalVariableTest ft = new FinalVariableTest();
        System.out.println(ft.a);
        System.out.println(ft.c);
        System.out.println(ft.d);
        //系统不会对final变量隐氏初始化，即不会给变量赋默认值
    }
}

