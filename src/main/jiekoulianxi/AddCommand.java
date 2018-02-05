//package main.jiekoulianxi;
//
//public class AddCommand implements  Command
//{
//    public void process (int[] target)
//    {
//        int sum = 0;
//        for (int tmp : target)
//        {
//            sum += tmp;
//        }
//        System.out.println( "数组元素的总和是：" + sum );
//    }
//}

package main.jiekoulianxi;

public  class  AddCommand implements Command
{
    public  static  int a = 11;
    public void process(int[] target)
    {
        int sum = 0;
        for (int tmp : target)
        {
            sum += tmp;
        }
        System.out.println( "目标数组的总和" + sum );
    }
}