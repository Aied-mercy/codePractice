package 面向对象_04_;
import java.util.Random;
public class Test_02 {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);  //20
        s.display(); //20

        Base b = s;     //等价于 Base b = new Sub()   // 体现多态性
        //== , 对于引用数据类型来讲，比较的是两个引用数据类型变量的地址值是否相同
        System.out.println(b == s);   //true
        System.out.println(b.count);  //10
        // 解释为什么是10 ；  因为面向对象的多态性是 适用于方法的，不适用属性；
           //而且 编译看左边（Base b），执行看右边( s( new Sub() ) )
        b.display();   //20
    }
}
class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}
class Sub extends Base{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}

