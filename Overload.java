package 面向对象_01;

public class Overload {
    public static void main(String[] args) {
        //方法的重载测试
        Overload overload = new Overload();
        overload.max(1,2);
    }
    public int max(int i,int j)
    {
        System.out.println("1");
        return (i>j)?i:j;
    }
    public double max(double i,double j)
    {
        return (i>j)?i:j;
    }
    public double  max(int i,double j)
    {    //返回类型为double ，因为 类型从高到低要强制转换，而低到高可自动转换
        return (i>j)?i:j;
    }
}
