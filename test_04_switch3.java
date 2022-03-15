package day_test_选择结构;

import java.util.Scanner;

public class test_04_switch3 {
    // 从键盘分别输入年、月、日，判断这一天是当年的第几天
    // 注 ： 判断一年是否 为闰年的标准
      // （1）可以被 4 整除，但不可被 100 整除
      // （2）可以被 400 整除
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入year：");
        int year = scan.nextInt();
        System.out.println("请输入month：");
        int month = scan.nextInt();
        System.out.println("请输入day：");
        int day = scan.nextInt();
        int sumday = 0;
        switch (month)
        {     //逆序 防止没有break 时 会一直往下运行
            case 12:
                sumday += 30;
            case 11:
                sumday += 31;
            case 10:
                sumday += 30;
            case 9:
                sumday += 31;
            case 8:
                sumday += 31;
            case 7:
                sumday += 30;
            case 6:
                sumday += 31;
            case 5:
                sumday += 30;
            case 4:
                sumday += 31;
            case 3:  //判断 year 是否 为 闰年
                if((year % 4 == 0 && year % 100 != 0)||year % 400 == 0)
                {
                    sumday += 29;
                }
                else {
                    sumday += 28;
                }
            case 2:
                sumday += 31;
            case 1:
                sumday += day;
        }
        System.out.println(year+"年"+month+"月"+day+"日"+"是当年的"+sumday+"天");
    }
}
