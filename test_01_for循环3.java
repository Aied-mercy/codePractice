package day_test_循环结构;

import java.util.Scanner;

public class test_01_for循环3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int m = scan.nextInt();
        System.out.println("请输入第二个整数：");
        int n = scan.nextInt();
        int min= (m <= n)?m:n;  //三目运算符找出最小值
        //最小公约数
        for(int i = min;i>=1;i--)
        {
            if(m%i==0&&n%i==0){
                System.out.println("最小公约数为："+i);
                break; //找到之后 break 跳出循环
                //如果不跳出循环 ，会打印输出所有满足 if条件的i值
            }
        }
        //最大公倍数
        int max = (m>=n)?m:n;
        for(int i = max;i<=m*n;i++)
        {
            if(i%m==0&&i%n==0){
                System.out.println("最小公倍数为："+i);
                break;
            }
        }


    }
}
