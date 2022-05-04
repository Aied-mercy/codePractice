package 面向对象_03_;

public class Test_override_01 {    //父类
    String name;
    int age;
    public Test_override_01(){

    }
    public Test_override_01(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void walk(int distance){
        System.out.println("走路,走的距离是：" + distance + "公里");
    }
}
