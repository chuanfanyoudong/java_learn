package main.innerclass;

/**
 * Created on 2018/2/5
 *
 * @author jiangzhenkang
 */
public class Cow {
    private double weight;
    public Cow(){}
    public Cow(double weight){
        this.weight = weight;
    }
    private class CowLeg{
        private double lengh;
        public String color;
        public CowLeg(){}
        public CowLeg(double length,String color){
            this.lengh = length;
            this.color = color;
        }
        public void info(){
            System.out.println("当前牛腿颜色是：" + color + ",高："+lengh);
            System.out.println("本牛腿所在奶牛重："+weight);
        }
    }
    public void test(){
        CowLeg c1 = new CowLeg( 1.12,"黑白相间" );
        c1.info();
    }

    public static void main(String[] args) {
        Cow cow = new Cow( 378.9 );
        cow.test();
    }
}
