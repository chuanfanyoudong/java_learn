package main.lambda;

/**
 * Created on 2018/2/6
 *
 * @author jiangzhenkang
 */
interface  Eatable{
    void taste();
}
interface Flyable{
    void fly(String weather);
}
interface Addable{
    int add(int a,int b);
}

public class LambdaQs {
    public void eat(Eatable e){
        System.out.println(e);
        e.taste();
    }
    public void drive(Flyable f){
        System.out.println(f);
        f.fly( "我飞" );
    }
    public void test(Addable add){
        System.out.println("5与3"+add.add( 5,3 ));
    }

    public static void main(String[] args) {
        LambdaQs lq = new LambdaQs();
        lq.eat( () -> System.out.println("真好吃") );
        lq.drive( weather -> {
            System.out.println("今天"+weather);
            System.out.println("直升机平稳飞行");
        } );
        lq.test( (a,b) -> a-b );
    }
}