package day_test_01;

import java.util.Scanner;

public class test_03_if_else语句1 {
    public static void main(String[] args) {
        /*   要求： 测算狗的年龄
        我家的狗5岁了，5岁的狗相当于人类多大呢?其实，
        狗的前两年每一年相当于人类的10.5岁，之后每增加一年就增加4岁。
        那么5岁的狗就相当于人类多少年龄呢？应该是：
        10.5+10.5+4+4+4 = 33岁。
        编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人类的年龄。
        如果用户输入负数，请显示一个提示信息。
         */
        Scanner can = new Scanner(System.in);
        System.out.println("请输入小狗狗的年龄：");
        int dogAge = can.nextInt();
        if(dogAge>=0&&dogAge<=2)
            System.out.println("相当于人类的年龄："+dogAge*10.5+"岁");
        else if(dogAge>2)
            System.out.println("相当于人类的年龄："+((dogAge-2)*4+2*10.5)+"岁");
        else
            System.out.println("输入错误，小狗还没出生呢！");



    }
}
