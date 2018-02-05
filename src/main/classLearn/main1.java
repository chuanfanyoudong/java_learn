package main.classLearn;


public class main1 {
    public static void main(String[] args) {
        int i=99 ;
        int sum = -1000;
        assert sum != -100;
        sum = 0;
        for(i=0;i<100;i++) {

            sum += i;
        }

        System.out.println( sum );
    }
}
