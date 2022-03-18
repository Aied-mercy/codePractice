package day_test_循环结构;

public class test_02_for嵌套循环2 {
    public static void main(String[] args) {
        //输出 菱形
        for(int i=1;i<=5;i++)    //控制行
        {
            for(int j=1;j<=5-i;j++){  //控制空格
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){   //控制*号输出
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 1;i<=5;i++)  //打印行数
        {
            for(int j = 1;j<=i;j++)  //打印空格
            {
                System.out.print(" ");
            }
            for(int k = 1;k<=9-2*i;k++) //打印*号输出
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
