package 面向对象_04_;

public class Test_01_Animal {
    public static void main(String[] args) {
        Test_01_Animal test = new Test_01_Animal();
        test.func(new Dog());   //多态性的使用
        test.func(new Cat());   //多态性的使用
    }/*
    public void func(Dog dog){
        dog.eat();
        dog.shout();                           这两个方法是不用多态性时的写法
    }
    public void func(Cat cat){
        cat.eat();
        cat.shout();
    }*/



    public void func(Animal animal){   //本质 Animal animal = new Dog() 或 或  Animal animal = new Cat()
                                    //  左边（Animal animal :是父类 Animal 程序编译时是这个，
                                    //  右边（new Dog() :是对象，程序执行时是Dog 类或 Cat 类
        animal.eat();
        animal.shout();
    }
}

class Animal
{
    public void eat() {
        System.out.println("动物吃东西！");
    }
    public void shout(){
        System.out.println("动物叫！");
    }
}
class Dog extends Animal
{
    public void eat(){    //重写
        System.out.println("狗吃骨头！");
    }

    public void shout() {   //重写
        System.out.println("狗叫：汪，汪，汪！");
    }
}
class Cat extends Animal
{
    public void eat() {   //重写
        System.out.println("猫吃鱼！");
    }

    public void shout() {   //重写
        System.out.println("猫叫：喵，喵，喵！");
    }
}