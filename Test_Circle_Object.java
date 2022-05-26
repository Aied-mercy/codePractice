package 面向对象_04_;

public class Test_Circle_Object {
    public static void main(String[] args) {
        Object_Test_02_Circle circle1 = new Object_Test_02_Circle(2.3);
        Object_Test_02_Circle circle2 = new Object_Test_02_Circle(2.3,"white",2.0);
  //    Object_Test_02_Circle circle2 = new Object_Test_02_Circle(2.3,new String("white"),2.0);
    // 上面这句：等同  因为 equals（） 重写后 比较的就是内容
        System.out.println("颜色是否相等：" +
                circle1.getColor().equals(circle2.getColor()) );
        System.out.println("半径是否相等：" + circle1.equals(circle2));
        //直接比较对象， 对象里面的equals（）方法 比较的就是半径

        System.out.println(circle1);
        System.out.println(circle2.toString());  //输出的已经不是地址值了，
                                                //因为已经重写了，输出的就是内容
    }
}
