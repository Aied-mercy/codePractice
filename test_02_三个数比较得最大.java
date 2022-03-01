package day_test_01;

public class test_02_三个数比较得最大 {
    public static void main(String[] args) {
        /*定义三个int型变量并赋值，
        使用三元运算符或者if-else获取这三个数中的较大数的实现
         */
        //if-else 求最大
        int num1 = 10;
        int num2 = 21;
        int num3 = 4;
        int max ;
        if((num1>=num2)&&(num1>=num3)){
            max = num1;
        }
        else if((num2>=num1)&&(num2>num3)){
            max = num2;
        }
        else
            max = num3;
        System.out.println("最大值为："+max);
        // 三目运算符求三个数的最大值
        /**int n1 = 12;
         * int n2 = 30;
         * int n3= -43;
         * int max1 = (n1>n2)?n1:n2;
         * int max2 = (max1>n3)?max1:n3;
         * System.out.println("三个数中的最大值为:"+max2);
         */

    }
}
