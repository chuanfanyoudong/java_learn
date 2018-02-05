package main.classLearn;

/**
 * @author zhenkangjiang
 * 这是我练习接口的文档
 * 上面全是错误，不要乱看
 * @return 错误
 */

interface  interfaceC extends interfaceA,interfaceB
{
    int PROP_A = 6;
    void testC();
}

public class InterfaceExtendsTest
{
    public static void main(String[] args)
    {
        System.out.println( interfaceA.PROP_A );
        System.out.println( interfaceB.PROP_B );
        System.out.println( interfaceC.PROP_A );
    }
}