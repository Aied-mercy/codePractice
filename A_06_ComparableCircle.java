package Java基础_05;
/*
定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口
在ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半径大小
 */
public class A_06_ComparableCircle extends A_06_Circle implements A_06_CompareObject{
    public A_06_ComparableCircle(double radius){
        super(radius);
    }
    @Override
    public int compareTo(Object o){
        if(this == o){
            return 0;
        }
        if( o instanceof A_06_ComparableCircle){
            A_06_ComparableCircle c = (A_06_ComparableCircle)o;
            if(this.getRadius()>c.getRadius()){
                return 1;
            }else if(this.getRadius()<c.getRadius()){
                return -1;
            }else{
                return 0;
            }
        }else{
            //return 0;   两种随机一种 ，要是想捕获异常也是可以的
            throw new RuntimeException("传入的数据类型不匹配！");
        }
    }
}
