package main.classLearn;

public class StaticPractice {
    public static int a = 4;//若不加static则后面会报错，因为静态方法（下一行为静态方法）不能直接访问非静态成员
    public static void main (String[] args)
    {
        System.out.println( a );
    }
}
