package day_test_循环结构;

public class test_02_for循环5 {
    public static void main(String[] args) {
        //输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字
        //立方和等于其本身。 例：153 = 1*1*1 + 5*5*5 + 3*3*3
        for(int i = 100;i<1000;i++)
        {
            int g = i/100;
            int s = i%100/10;
            int q = i%10;
            if(i == g*g*g+s*s*s+q*q*q )
            {
                System.out.println("水仙花数为："+i);
            }

        }
    }
}
