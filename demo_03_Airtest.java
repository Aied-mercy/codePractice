package 面向对象_02_封装性;

public class demo_03_Airtest {
    //编写两个类：其中一个类声明私有的底边长base和height，同时声明公共方法访问私有变量
    //此外，提供类必要的构造器
    public static void main(String[] args) {
        demo_03_Air d = new demo_03_Air();
        d.setBase(2.0);
        d.setHeight(2.4);
      //     d.base = 2.0      不可以直接赋值，private 私有化了
        //   所以 用了 以上的 方法来赋值 且 初始化
        System.out.println("base ="+d.getBase()+", height = "+d.getHeight());
        demo_03_Air d1 = new demo_03_Air(5.1,5.6);
        System.out.println("base ="+d1.getBase()+", height = "+d1.getHeight());




    }
}
