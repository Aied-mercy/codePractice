package 面向对象_02_封装性;

public class demo_01_封装 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "张三";
        a.age = 18;
        a.eat();
        a.show();
    }
    //体会 private 权限修饰符的使用
}
class Animal
{
    String name;
    int age;
    private int legs;   //腿的个数

    public int getLegs()
    {
        return legs;
    }                            //我们将类的属性私有化（private），同时，提供
    public void setLegs()        //公共的（public）方法来获取和设置 属性
    {                           // 例 ： legs
        legs = 4;   //封装性的体现
    }
    //对属性的设置
    public void setLags(int l)
    {
        if(l>=0&&1%2==0){
            legs = 1;
        }else{
            legs = 0;
        }
    }
    public void show()
    {
        System.out.println("name = "+name+",age ="+age+",legs ="+legs);
    }
    public void eat()
    {
        System.out.println("动物进食");
    }
}
