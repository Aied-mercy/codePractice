package Java基础_面向对象_04_;
// 单例模式 ———— 饿汉式
public class Test_Singleton {
    public static void main(String[] args) {

     //   Bank bank1 = new Bank();
     //   Bank bank2 = new Bank();     因为类的构造器已经私有化了

        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2); //输出为 true ,所以称为单例模式
    }
}
//饿汉式
class Bank{
    //1.私有化类的构造器
    private Bank(){
        
    }
    //2.内部创建类的对象
    //4.要求此对象也必须声明为静态的
    private static Bank instance = new Bank(); //饿汉式与懒汉式的区分点

    //3.提供公共的方法，返回类的对象
    public static Bank getInstance(){  //只有提供静态的方法才能被调用
        return instance;  //静态才能 调 静态 ，所以创建的对象也只能是静态的
    }

}
