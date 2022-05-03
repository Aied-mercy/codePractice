package 面向对象_03_;

import java.rmi.ConnectIOException;

public class Circle {
    private double radius;  //半径

    public Circle(){
        radius = 1.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double findArea(){
        return Math.PI*radius*radius;
    }
}
