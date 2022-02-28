package 自我理解;

public class day_08_2_方法 {
    public static void main(String[] args) {
        test();
    }
    public static void test()
    {
        for(int i=1;i<=1000;i++)
        {
            if(i % 5 == 0)
                System.out.print(i+"\t");
            if(i%15==0)
                System.out.println();
        }
    }
}
