package main.objectprocess;

import main.chushihuakuai.Person;

/**
 * Created on 2018/2/1
 *
 * @author jiangzhenkang
 */

public class PrintObject {
    public static void main(String[] args) {
        Person p = new Person("猪八戒的师兄是孙悟空");
        System.out.println(p);
        //toString方法是Object的一个实例方法 所有的Java对象都具有这个方法
        System.out.println(p.toString());
        System.out.println(p+"");
    }
}
