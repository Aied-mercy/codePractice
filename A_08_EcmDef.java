package Java基础_05;
import java.util.Scanner;
import java.util.Scanner;
public class A_08_EcmDef {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();*/
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            int result = ecm(i, j); //抛出异常，而且为非运行时异常，所以得写一个try -catch异常处理
            System.out.println(result);
        }catch(NumberFormatException e){
            System.out.println("数据类型不一致！");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数！");
        }catch(ArithmeticException e ){
            System.out.println("除以 0 错误~");
        }catch(A_08_EcDef自定义异常类 e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //throws 为异常处理
    public static int  ecm(int i ,int j) throws Exception{
        if(i < 0 || j <0){
            //System.out.println("分子或分母为负数了！");
            throw new A_08_EcDef自定义异常类("分子或分母为负数了！");//抛出异常了 就得有throws异常处理
        }
        return i/j;
    }
}
