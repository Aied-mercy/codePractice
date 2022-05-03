package 面向对象_03_;

import sun.util.resources.cldr.ar.CalendarData_ar_LY;

import javax.swing.*;

public class Cylinder extends Circle {
    private double length; //高

    public Cylinder(){
        length = 1.0;
    }
    public double getLength(){
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    //返回圆柱的体积
    public double findVolume(){
        return Math.PI*getRadius()*getRadius()*getLength();
        //return findArea()  * getLength();
        // 两种方式都可以
    }
}
