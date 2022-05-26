package 面向对象_04_;

public class Object_Test_01 {
    protected String color;
    protected double weight;
    public Object_Test_01(){
        super();
        this.color = "white";
        this.weight = 1.0;
    }
    public Object_Test_01(String color,double weight){
        super();
        this.color = color;
        this.weight = weight;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
}
