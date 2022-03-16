package day_test_循环结构;

public class test_01_for循环1 {
    public static void main(String[] args) {
        //编写程序从 1 循环到 150，并在每行打印一个值，
        // 另外在每个 3 的倍数行上打印出’foo‘，在每个 5 的倍数行上
        // 打印‘biz’，在每个 7 的倍数行上打印输出‘baz’
        for(int i=1;i<=150;i++)
        {
            System.out.print(i+ " ");
            if(i%3==0){
                System.out.print(" foo ");
            }
            if(i%5==0){
                System.out.print(" biz ");
            }
            if(i%7==0){
                System.out.print(" baz ");
            }
            System.out.println(" ");
        }
    }
}
