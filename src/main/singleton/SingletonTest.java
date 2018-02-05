package main.singleton;

/**
 * Created on 2018/2/1
 *
 * @author jiangzhenkang
 */
class Singleton {
    private static Singleton ourInstance = new Singleton();
    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
public class SingletonTest{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
//        Singleton s3 = new Singleton();由于Sington的类的构造器为private所以不能通过这种方法创造新类，所以只能通过上面的getInatance方法来创造新类，因此可以对创造的心累进行约束了。
        System.out.println(s1 == s2);
    }

}