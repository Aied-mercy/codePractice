package 面向对象_04_;

public class GeometricObject {
    protected String color;
    protected double weight;

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    public GeometricObject(String color,double weight){
        super();
        this.color = color;   //构造器的初始化
        this.weight = weight;
    }
    public double findArea(){
        return 0.0;
    }
}
