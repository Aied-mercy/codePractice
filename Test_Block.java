package 面向对象_04_;
public class Test_Block {
    public static void main(String[] args) {
        String desc = Person11.desc;
        Person11 p1 = new Person11();
        Person11 p2 = new Person11();
        System.out.println(p1.age);
        Person11.info();
    }
}
class Person11
{
    String name;
    int age;
    static String desc = "我是一个人";
    //构造器
    public Person11(){
    }
    public Person11(String name,int age){
        this.name = name ;
        this.age = age;
    }
    // static 代码块
    static{
        System.out.println("hello,static block");
        desc = "我是一个爱学习的人";
    }
    // 非 static 代码块
    {
        System.out.println("hello,block");
        age = 1;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public String toString(){
        return "Person [name  = "+ name + ",age = "+ age + "]";
    }
    public static void info()
    {
        System.out.println("我很开心！");
    }
}
