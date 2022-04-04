package 面向对象_02_封装性;

public class demo_02_1 {
    public static void main(String[] args) {
        demo_02_ d = new demo_02_();
       // d.age = 1;  编译不通过，这个是错误的，因为 age 为 private （私有化）
        d.setAge(12);   //所以通过调用方法来 赋值 这就是封装性的体现之一
        System.out.println("年龄为："+d.getAge());
    }

}
