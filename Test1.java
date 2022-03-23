package 面向对象;

public class Test1 {
    public static void main(String[] args) {
   //编写程序，声明一个method()方法，在方法中打印一个10*8的*型矩形
    // 再在 main 方法中调用该方法
        Test1 t1 = new Test1();
        t1.method1();
    }
    public void method1()
    {
        for(int i=1;i<=10;i++ )   //打印 行
        {
            for(int j= 1;j<=8;j++)  //打印 列
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
