package 面向对象_04_;

public class Test_MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }

    public Test_MyRectangle(double width,double height,String color, double weight) {
        super(color, weight);
        this.height = height;    //构造器的初始化
        this.width = width;
    }
    public double findArea(){
        return width * height;
    }
}
