package main.finalpractice;

/**
 * Created on 2018/2/5
 *
 * @author jiangzhenkang
 */
public class StringJoinTest {
    public static void main(String[] args) {
        String s1 = "疯狂Java";
        //s2直接引用常量池中的"疯狂Java"字符串
        String s2 = "疯狂"+"Java";
        System.out.println(s1 == s2);
        final String str1 = "疯狂";
        final String str2 ="Java";
        String s3 = str1 + str2;
        System.out.println(s1 == s3);
        System.out.println(s1.getClass());
    }
}
