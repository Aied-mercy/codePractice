package 面向对象_04_;

public class Test_Circle extends GeometricObject{
    private double radius;

    public Test_Circle(double radius,String color, double weight) {
        super(color, weight);
        this.radius =radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double findArea(){   //方法的重写
        return 3.14 * radius * radius;
    }
}
