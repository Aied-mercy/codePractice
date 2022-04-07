package 面向对象_02_封装性;
public class demo_04_girl {
    private String name;
    private int age;
    public demo_04_girl()
    {
    }
    public demo_04_girl(String name,int age){
        this.name = name;         // 构造器初始化赋值
        this.age = age;
    }
    public void setName(String name){
        this.name = name ;
    }
    public String getName(){
        return name;
    }
    public void marry(demo_04_boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);
        // this 代表的是当前对象，谁调 marry 谁就是 this
    }
}
