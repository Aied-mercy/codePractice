package 面向对象_03_;
/*   方法的重写
     1、重写：子类继承父类以后，可以对父类中同名同参数的方法，进行覆盖操作
     2、应用：重写以后，当创建子类对象以后，
             通过子类对象调用父类中的同名同参数的方法时，
             实际执行的是子类重写父类的方法。     */
public class Test_override_03 {
    public static void main(String[] args) {
        Test_override_02 test = new Test_override_02("软件工程");
        test.eat();
        test.walk(10);
        test.study();

        //当父类创建对象时，调用的eat()方法依然是原来的，不是覆盖之后的eat()方法
        Test_override_01 s = new Test_override_01();
        s.eat();

    }
}
