package 面向对象;

public class personTest {
    public static void main(String[] args) {
        Person p1 = new Person();  //实例化
        p1.name = "Tom";
        p1.age = 18;
        p1.sex = 1;
        p1.study();
        p1.showAge();
        int newAge = p1.addAge(2);
        System.out.println(p1.name + "的新年龄为："+ newAge);
        System.out.println(p1.age);
        System.out.println("----------------------");
        Person p2 = new Person();
        System.out.println(p2.age);  //打印输出的结果为 0
               //因为 调用的是 person 类 的属性
        p2.addAge(15);
        int newAge2 = p2.age;
        System.out.println("newAge2:"+newAge2);
        p2.showAge();

    }
}
