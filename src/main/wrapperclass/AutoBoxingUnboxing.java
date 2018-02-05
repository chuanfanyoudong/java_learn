package main.wrapperclass;

/**
 * Created on 2018/1/31
 *
 * @author jiangzhenkang
 */
public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        Integer inObj = 5;
        Object boolObj = true;
        int it = inObj;
        if (boolObj instanceof Boolean){
            boolean b = (Boolean)boolObj;
            System.out.println(b);
        }
    }
}
