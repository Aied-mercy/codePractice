package day_test_选择结构;

import java.util.Scanner;

public class test_04_switch2 {
    //要求：从键盘上输入2019年的‘month’和‘day‘，要求通过程序输出输入的日期为
    //     2019年的第几天。
    //例 ：2月15号    为2019年的第46天
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入month：");
        int month = scan.nextInt();
        System.out.println("请输入day：");
        int day = scan.nextInt();
        int sumday = 0;
        switch(month)
        {
 // 如果正序写 程序不会退出  会一直到case12 把所有加一遍
            //逆序 就可避免这样的情况
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
            case 3:
                sumday += 28;
            case 2:
                sumday += 31;
            case 1:
                sumday += day;
        }
        System.out.println("2019年"+month+"月"+day+"日"+"是当年的"+sumday+"天");
        /*    //正序输出 结果大不相同
         case 1:
            sumday += day;
         case 2:
            sumday += day;
         case 3:
            sumday += day;
         case 4:
            sumday += day;
         case 5:
            sumday += day;
         case 6:
            sumday += day;
         case 7:
            sumday += day;
         case 8:
            sumday += day;
         case 9:
            sumday += day;
         case 10:
            sumday += day;
         case 11:
            sumday += day;
         case 12:
            sumday += day;

         */
    }

}
