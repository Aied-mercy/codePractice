package day_test_选择结构;

public class test_04_switch {
    public static void main(String[] args) {
        //例题：对学生成绩大于60分的，输出“合格”，低于60分的，输出“不合格“
        //说明：如果switch_case结构中的多个case的执行语句相同，则可以考虑进行合并。
        int score = 78;
        switch (score/10)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格！");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格！");
                /*
                更优的解决方案！！！
                switch(score/60)
                {
                   case 0:
                       Syetem.out.println("不及格！");
                       break;
                   case 1:
                       Syetem.out.println("及格！");
                       break;
                }
                 */
        }
    }
}
