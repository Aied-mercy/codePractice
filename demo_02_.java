package 面向对象_02_封装性;

public class demo_02_ {
    //1.创建程序，在其中定义两个类。定义如下：
    //用setAge（）设置人的合法年龄（0~130），用getAge（）返回人的年龄。
    //在其中一个类中实例化，再调用setAge（）方法和getAge（）方法，体会java的封装性

    private int age;
    public void setAge(int a)
    {
        if(a<0 || a>130)
        {
            System.out.println("您的输入有误！");
            return;
        }
        age = a;

    }
    public int getAge()
    {
        return age;
    }

}
