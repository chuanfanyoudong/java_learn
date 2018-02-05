package main.Collection;

import java.util.*;

/**
 * Created on 2018/2/2
 *
 * @author jiangzhenkang
 */
public class SetLearn {
    public static void main(String[] args) {

        List<String> set1=new ArrayList<>();
        set1.add("1");    //向列表中添加数据

        set1.add("2");     //向列表中添加数据

        set1.add("3");   //向列表中添加数据

        set1.add("4");    //向列表中添加数据

        int size=set1.size();

        System.out.println("Set1集合的大小为：" + size);

        List<String> set2=new ArrayList<>();
        set2.add("4");     //向列表中添加数据

        set2.add("5");    //向列表中添加数据

        int size2=set2.size();

        System.out.println("Set2集合的大小为：" + size2);

        set1.addAll(set2);

        System.out.println("合并后Set1集合的大小为：" + set1.size());

    }
}
