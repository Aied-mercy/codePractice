package day_test_循环结构;

public class test_02_for嵌套循环1 {
    public static void main(String[] args) {
        // 打印输出三角形
        for(int i = 1;i<=5;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
