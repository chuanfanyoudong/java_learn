package main.lambda;

import main.jiekoulianxi.Command;
import main.jiekoulianxi.ProcessArray;

/**
 * Created on 2018/2/6
 *
 * @author jiangzhenkang
 */
public class CommandTest{
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int [] target = {3,-4,6,4};
        pa.process( target, new Command() {
            @Override
            public void process(int[] target) {
                int sum = 0;
                for (int tmp : target)
                {
                    sum += tmp;
                }
                System.out.println("数组的元素的总和是："+sum);
            }
        } );
    }
}