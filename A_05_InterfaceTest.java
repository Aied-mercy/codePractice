package Java基础_05;

public class A_05_InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
      //  Flyable.MIN_SPEED = 1 ;  不可以赋值，因为只是省略了final 本身还是final

        plane p = new plane();  //当所有的抽象方法被覆盖或者重写时，才可以创建类的对象，把类实例化
        p.fly();
        p.stop();
    }
}
interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;//这里省略了 public static final

    //抽象方法
    //注意：抽象方法没有方法体，不能实现功能，必须子类继承重写抽象方法 或者 实现接口
    public abstract void fly();
    void stop();   //省略了 public abstract
}
class plane implements Flyable{
    @Override
    public void fly(){
        System.out.println("该航空准备起飞预备！");
    }
    @Override
    public void stop(){
        System.out.println("飞机降落，停机了！");
    }
}



