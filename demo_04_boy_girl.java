package 面向对象_02_封装性;

public class demo_04_boy_girl {
    public static void main(String[] args) {
        demo_04_boy b = new demo_04_boy("二狗子",22);
                                       //构造器传参初始化，在赋值
        b.shut();
        demo_04_girl girl = new demo_04_girl("张三",18);
        girl.marry(b);   //这个 b 就是 “二狗子” 放进去
    }
}
