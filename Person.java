package 面向对象;

public class Person {
    String name;
    int age;
    int sex;
    /*
    sex = 1 男
    sex = 2 女
    **/

    public void study()
    {
        System.out.println("Studying");
    }
    public void showAge()
    {
        System.out.println("age:"+age);
    }
    public int addAge(int i)
    {
        age += i;
        return age;
    }
}
