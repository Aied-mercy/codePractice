package books_Test;

public class test {
    public static void main(String[] args) {
        /*double i = 1,a = 1,sum = 0;
        while (i<=20)
        {
            a = a * i;
            i++;
            sum = sum + a;
        }
        System.out.println("sum = "+ sum);
        */
        //要求：输出 1！+2！+3！+4！...+20！
         double sum = 0,a = 1;
         int i = 1;
         while (i<=20)
         {
             sum = sum + a;
             i++;
             a = a * i;
         }
        System.out.println("sum = "+ sum);
    }
}
