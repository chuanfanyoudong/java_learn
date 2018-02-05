package main.Collection;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created on 2018/2/2
 *
 * @author jiangzhenkang
 */
public class FileTest {
    public static void main(String[] args) {
//        String path = "D:\\eastmoneywork\\智能投顾\\知识信息\\知识信息.txt";
//        File file = new File( path );
//        System.out.println(file.exists());
        Collection a = new ArrayList();
        a.add( "dasfa" );
        a.add(126);
        a.addAll( a );
        System.out.println(a);
        a.remove(  123);
        System.out.println(a);

    }
}
