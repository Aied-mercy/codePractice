package 面向对象_04_;

public class Object_Test_02_Circle extends Object_Test_01 {
    private double radius;
    public Object_Test_02_Circle(){
        super();
        radius = 1.0;
    /*    color  = "white";   //这两句代码不用重复写，
        weight = 1.0  */      //因为super() 已经调用了父类的构造器
    }
    public Object_Test_02_Circle(double radius){
        super();
        this.radius = radius;
    }
    public Object_Test_02_Circle(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    //求圆的面积
    public double findArea(){
        return 3.14 * radius *radius;
    }
    @Override  //比较两个圆的半径是否相等，如相等，返回 true
    public boolean equals(Object obj){
        if( this == obj){
            return true;
        }
        if(obj instanceof Object_Test_02_Circle){
            Object_Test_02_Circle o = (Object_Test_02_Circle) obj;
            return this.radius == o.radius;   //比较的就是半径
        }
        return false;
    }
    @Override
    public String toString(){
        return "Circle [radius = "+ radius + "]";
    }
}

