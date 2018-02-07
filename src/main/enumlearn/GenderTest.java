package main.enumlearn;

/**
 * Created on 2018/2/7
 *
 * @author jiangzhenkang
 */
public class GenderTest {
    public static void main(String[] args) {
        //通过Enum类的valueOf()方法来获取指定枚举类的枚举值
        Gender g = Enum.valueOf( Gender.class,"FEMALE" );
        g.setName("女");
        System.out.println(g + "代表" + g.getName());
    }
}
