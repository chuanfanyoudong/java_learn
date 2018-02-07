package main.gabargecollection;

/**
 * Created on 2018/2/7
 *
 * @author jiangzhenkang
 */
public class StatusTransfer {
    public static void test(){
        String a = new String( "轻量级Java比赛" );
        a = new String( "疯狂Java" );//这条语句运行完成后，上一个String已经没有引用指向它，处于可恢复状态
        System.out.println(a);
        System.gc();
    }

    public static void main(String[] args) {
        test();
    }
}
