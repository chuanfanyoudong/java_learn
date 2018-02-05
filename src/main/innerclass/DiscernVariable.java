package main.innerclass;

/**
 * Created on 2018/2/5
 *出现变量名重复的处理方法
 * @author jiangzhenkang
 */
public class DiscernVariable {
    private String prop;
    private class Inclass{
        private String prop = "内部类的实例变量";
        public void info(){
            String prop = "局部变量";
            System.out.println("外部类的实例变量："+DiscernVariable.this.prop);
            System.out.println("内部类的实例变量："+this.prop);
            System.out.println("局部变量的值："+prop);
        }
    }
    public void test(){
        Inclass in = new Inclass();
        in.info();
    }

    public static void main(String[] args) {
        new DiscernVariable().test();
    }
}
