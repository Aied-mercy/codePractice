package day_test_01;

import java.util.Scanner;

public class test_02_用方法计算面积 {
    float rea(float L,float W){
        float S;
        S = L*W;
        return S;
    }
    public static void main(String[] args) {
        System.out.println("请输入长和宽：");
        Scanner can = new Scanner(System.in);
        float l =can.nextFloat();
        float w =can.nextFloat();
        test_02_用方法计算面积 rec = new test_02_用方法计算面积();//实例化
        //使用类或方法时需要 类的实例化
        float s = rec.rea(l,w);
        System.out.println("面积是："+s);
    }
}
