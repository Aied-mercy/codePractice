package 面向对象_02_封装性;

public class demo_04_boy {
    private String name;
    private int age;
    public demo_04_boy()
    {
    }
    public demo_04_boy(String name,int age)   //构造器的重载
    {
        this.name =name ;    //this关键字 是 为形参的命名 使我们更容易 见名知意
        this.age = age;
    }
    public void setName(String name)
    {
        this.name = name ;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void marry(demo_04_girl girl) {
        System.out.println("我想娶" + girl.getName());
    }
    public void shut()
    {
        if(this.age>=22){
            System.out.println("合法谈恋爱!");
        }
    }

}
