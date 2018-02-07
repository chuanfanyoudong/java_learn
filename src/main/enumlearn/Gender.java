package main.enumlearn;

/**
 * Created on 2018/2/7
 *
 * @author jiangzhenkang
 */
public enum Gender implements GenderDesc{
    MALE,FEMALE;
    private String name;
    public void setName(String name){
        switch (this){
            case MALE:
                if (name.equals( "男" )){
                    this.name = name;
                }else {
                    System.out.println("参数错误");
                    return;
                }
            case FEMALE:
                if (name.equals( "女" )){
                    this.name = name;
                }else {
                    System.out.println("参数错误");
                    return;
                }
                break;
        }
    }

    public String getName() {
        return this.name;
    }
    public void info(){
        System.out.println("这是一个用于定义性别的枚举类");
    }
}
