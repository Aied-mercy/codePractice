package 面向对象_04_;
public class Interview {
    public static void main(String[] args) {
        Base1 base = new Sub1();
        base.add(1,2,3);
        Sub1 s = (Sub1)base;
        s.add(1,2,3);  }
}
class Base1 {
    public void add(int a,int...arr){
        System.out.println("base1");   }
}
class Sub1 extends Base1{
    public void add(int a,int[] arr){
    System.out.println("Sub1");  }
    public void add(int a,int b,int c){  //在确定了多个参数的，优先选择
        System.out.println("Sub2");
    }
}

