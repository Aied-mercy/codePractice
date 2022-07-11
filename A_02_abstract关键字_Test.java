package Java基础_05;
//编写一个employee类，声明为抽象类，包含如下三个属性：name,id,salary,
//提供必要的构造器和抽象方法：work();对于Manager类来说，他既是员工，
// 还具有奖金(bonus)的属性，要求：请使用继承的思想，设计CommonEmployee类和Manager类，
//要求类中提供必要的方法进行属性访问
public class A_02_abstract关键字_Test {
    public static void main(String[] args) {
        //多态
        A_02_abstract关键字_Employee manager = new A_02_abstract关键字_Manager("张三",1001,5000,20000);
        manager.work();//调用重写以后的方法

        A_02_abstract关键字_CommonEmployee common = new A_02_abstract关键字_CommonEmployee();
        common.work(); //也是调用重写以后的方法


    }
}
