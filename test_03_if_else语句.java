package day_test_01;

import java.util.Scanner;

public class test_03_if_else语句 {
    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);
        System.out.println("请输入你的期末成绩（0~100）：");
        int score = can.nextInt();
        if(score == 100)
            System.out.println("你真优秀！");
        else if(score>=60&&score<90)
            System.out.println("再接再厉！");
        else if(score >=90&&score <100)
            System.out.println("你真不错");
        else
            System.out.println("你还需要加一把油啊！");
    }
}
