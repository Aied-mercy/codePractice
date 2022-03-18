package day_test_循环结构;

public class test_02_for循环4 {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        // 打印1~100之间所有是7的倍数的整数的个数及总和（体会设置计数器的思想）
        for(int i=1;i<=100;i++){
            if(i%7==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("7的倍数个数："+count);
    }
}
