package 面向对象;

public class Test2 {
    public static void main(String[] args) {
        //要求：编写程序，声明一个method()方法，在方法中打印一个 m * n 的矩形
        // 再在 main 方法中调用该方法 ，并返回面积值
        Test2 t2 = new Test2();
        int area = t2.method(10,12);
        System.out.println("面积是："+ area ) ;

    }
    public int method(int m,int n)
    {
        for(int i =1 ;i<=m;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        return m*n;
    }
}
