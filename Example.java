package 课本练习;

public class Example {
    public static void main(String[] args) {
        Lader.xialower = 100; //Lader的字节码被加载到内存，通过类名操作类变量
        Lader laderone = new Lader();
        Lader ladertwo = new Lader();
        laderone.setUplower(28);
        ladertwo.setUplower(66);
        System.out.println("laderone的上底："+laderone.getUplower());
        System.out.println("laderone的下底："+laderone.getXialower());
        System.out.println("ladertwo的上底："+ladertwo.getUplower());
        System.out.println("ladertwo的下底："+ladertwo.getXialower());
    }
}
