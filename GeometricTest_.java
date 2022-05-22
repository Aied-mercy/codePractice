package 面向对象_04_;

import 面向对象_03_.Circle;
/*定义一个测试类GeometricTest,
编写equalsArea方法测试两个对象的面积是否相等(注意方法的参数类型，利用动态绑定技术)，
编写displayGeometricObject方法显示对象的面积(注意方法的参数类型，利用动态绑定技术)。
*/
public class GeometricTest_ {
    public static void main(String[] args) {
        GeometricTest_ test = new GeometricTest_();
        Test_Circle c1 = new Test_Circle(2.3,"white",1.0);
        test.displayGeometricObject(c1);
        Test_Circle c2 = new Test_Circle(3.3,"white",1.0);
        test.displayGeometricObject(c2);
        boolean isEquals = test.equalsArea(c1,c2);
        System.out.println("c1和c2的面积是否相等：" + isEquals);
    }

    public void displayGeometricObject(GeometricObject o){
        // 等价于 ：GeometricObject o = new Test_Circle();
        System.out.println("面积为：" + o.findArea());
    }
    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea() == o2.findArea();   //比较面积是否相等
    }




}
