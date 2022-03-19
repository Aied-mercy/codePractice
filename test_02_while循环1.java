package day_test_循环结构;
import java.util.Scanner;
public class test_02_while循环1 {
    public static void main(String[] args) {
        //从键盘输入多个整数，并判断输入的数为整数还是负数并分别统计
        //正数的个数和负数的个数，输入 0 时结束程序！
        Scanner scan = new Scanner(System.in);
        int positiveNumber = 0;
        int nagetiveNumber = 0;
        while (true)  // 用for循环 可等价于 for(;;)
        {
            System.out.println("请输入：");
            int number = scan.nextInt();
            if(number>0){
                positiveNumber++;
            }
            else if(number<0){
                nagetiveNumber++;
            }
            else{ //输入 0 时结束输入，跳出循环！
                System.out.println("结束输入！");
                break;
            }
        }
        System.out.println("输入的正数个数为："+positiveNumber);
        System.out.println("输入的负数个数为："+positiveNumber);
    }
}
