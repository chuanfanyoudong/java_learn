package main.classLearn;

/**
 * Created on 2018/2/1
 *
 * @author jiangzhenkang
 */
public class MemberOfClass {
    public static void test(){
        System.out.println("对象调用类方法，其实实际上用的还是类来调用，所以对象是null也ok");
    }
    public void object(){
        System.out.println("空对象调用实例方法，则会出错:java.lang.NullPointerException");
    }
    public static void main(String[] args) {
        MemberOfClass classTest = null;//这里对象是null同样可以调用类方法。
        classTest.test();
        classTest.object();

    }
}
