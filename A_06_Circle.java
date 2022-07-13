package Java基础_05;
/*
定义一个Circle类，声明radius属性，提供getter和setter方法
 */
public class A_06_Circle {
    private double radius ;
    public A_06_Circle(){
        super();
    }
    public A_06_Circle(double radius){
        super();
        this.radius = radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius ;
    }
    public double getRadius()
    {
        return radius;
    }
}
