package 面向对象_04_;

import java.util.concurrent.Callable;

public class Test_Circle_Static {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.4 );

        System.out.println("c1的id：" + c1.getId());
        System.out.println("c2的id：" + c2.getId());
        System.out.println("c3的id：" + c3.getId());

        System.out.println("创建圆的个数：" + Circle.getTotal());



    }
}
class Circle{
    private double radius;
    private int id;  //自动赋值
    public static int total;   //记录创建圆的个数
    public static int init = 1001;  //static 声明的属性被所有对象所共享

    public Circle(){
        id = init++;
        total++;
    }
    public Circle(double radius){
        id = init++;
        total++;
        this.radius = radius;
    }
    public double findArea(){
        return 3.14 * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public int getId(){
        return id;
    }
    public static int getTotal(){  //如果一个属性是静态的，那么通常操作这个属性的
        return total;              //方法也是静态的
    }
}
