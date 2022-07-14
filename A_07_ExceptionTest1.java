package Java基础_05;

public class A_07_ExceptionTest1 {
    public static void main(String[] args) {
        String str = "123";
        str = "abc";

        try {
            int num = Integer.parseInt(str);
            System.out.println("111");
        }catch(Exception e) {
            System.out.println("出现数值转换异常了，不要着急！");
            System.out.println(e.getMessage());
        }
        System.out.println("22222");
    }
    public void method(){

    }
}
