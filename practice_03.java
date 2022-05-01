package Java数组_01;
import java.util.Scanner;
public class practice_03 {
    /*  从键盘读入学生成绩，找出最高分，并输出学生成绩等级
     成绩 >=最高分 - 10   等级为‘A'
     成绩 >=最高分 - 20   等级为‘B'
     成绩 >=最高分 - 30   等级为‘C'
     其余        等级为 ’D‘
     提示：：先读入学生人数，根据人数创建 int 数组，存放学生成绩    */
    public static void main(String[] args){  //对题目的理解步骤如下：
        //1、使用Scanner，读取学生个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生个数：");
        int number = scanner.nextInt();
        //2、创建数组，存储学生成绩 ：数组为动态初始化
        int[] scores = new int[number];      //动态数组
        //3、给数组中的元素赋值
        System.out.println("请输入"+ number + "个学生的成绩：");
        for(int i = 0;i < scores.length;i++)
        {
            scores[i] = scanner.nextInt();
        }
        //4、获取数组中的元素的最大值：最高分
        int maxScores = 0;
        for (int i =0;i < scores.length ; i++)
        {
            if(maxScores < scores[i]){
                maxScores = scores[i];
            }
        }
        //5、根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
        char level ;
        for(int i = 0 ; i < scores.length ;i++)
        {
            if(maxScores - scores[i] <= 10){
                level = 'A';
            }else if(maxScores - scores[i] <= 20){
                level = 'B';
            }else if(maxScores - scores[i] <= 30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("student"+ i +"scores is"
                    + scores[i] + ",grade is" +  level);
        }


    }
}
