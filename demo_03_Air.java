package 面向对象_02_封装性;

public class demo_03_Air {
    private double base;
    private double height;

    public demo_03_Air()    //构造器
    {
                                        //上下两个 可以是  构造器重载
    }
    public demo_03_Air(double b,double h)   //构造器
    {
        base = b;         //初始化
        height  = h;      //初始化
    }

    public void setBase(double b)
    {
        base = b;
    }
    public double getBase()
    {
        return base;
    }
    public void setHeight(double h)
    {
        height = h;
    }
    public double getHeight()
    {
        return height;
    }

}
