package 面向对象_02_封装性;

public class demo_04_this关键字 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("tom" );
        System.out.println(p.getName());
    }
}
class Person
{
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;
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
}
