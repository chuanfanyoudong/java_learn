//package main.jiekoulianxi;
//
//public class CommandTest {
//    public static  void main(String[] args) {
//        ProcessArray pa = new ProcessArray();
//        int[] target = {3,-2,6,4};
//        pa.process( target,new PrintCommand() );
//        System.out.println( "-----------------" );
//        pa.process( target,new AddCommand() );
//    }
//}


package main.jiekoulianxi;

public class CommandTest{
    public static  void main(String[] args)
    {
        ProcessArray pa = new ProcessArray();
        int[] target = {-8,-9,8,9};
        pa.process( target,new PrintCommand() );
        pa.process( target,new AddCommand() );
    }
}