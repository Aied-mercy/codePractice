package Java基础_05;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class A_06_ComparableCircleTest {
    public static void main(String[] args) {
        A_06_ComparableCircle c1 = new A_06_ComparableCircle(3.4);
        A_06_ComparableCircle c2 = new A_06_ComparableCircle(3.6);

        int compareValue = c1.compareTo(c2);
        if(compareValue>0){
            System.out.println("c1对象大！");
        }else if(compareValue <0){
            System.out.println("c2对象大！");
        }else{
            System.out.println("c1与c2一样大");
        }

        int compareValue1 = c1.compareTo(new String("AA"));
        System.out.println(compareValue1);
    }
}
