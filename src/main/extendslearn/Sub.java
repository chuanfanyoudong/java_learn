package main.extendslearn;

/**
 * Created on 2018/1/29
 *
 * @author jiangzhenkang
 */
public class Sub extends Base{
    public String color;
    public Sub(double size,String name,String color){
        super(size,name);
        this.color = color;
    }

    public static void main(String[] args) {
        Sub s = new Sub( 5.6,"测试对象" ,"红色");
        System.out.println( s.size+"--"+s.name + "--" + s.color);
    }
}
