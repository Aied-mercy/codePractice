package 面向对象_03_;
                      //子类继承父类
public class Test_override_02 extends Test_override_01{
    String major;
    public Test_override_02(){

    }
    public Test_override_02(String major){
        this.major = major;
    }
    public void study(){
        System.out.println("学习，专业是：" + major);
    }
    public void eat(){   //重写了父类的eat()方法
        System.out.println("学生学习应该吃更多有营养的食物!!!");
    }
}
