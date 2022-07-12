package Java基础_05;
import java.util.Scanner;
/*
定义PayrollSyetem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
利用循环结构遍历数组元素，输出各个对象的类型，name,number,birthday
当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息
 */
public class A_04_payrollSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入当前的月份：");
        int month = scan.nextInt();

        A_04_Employee[] emps = new A_04_Employee[2];//创建动态数组
        emps[0] = new A_04_SalariedEmployee("张三",1002,new A_04_Mydate(1995,2,26),10000);
        emps[1] = new A_04_HourlyEmployee("王五",1001,new A_04_Mydate(1996,5,31),60,240);

        for(int i = 0;i<emps.length;i++){
            System.out.println(emps[i]);
            double salary = emps[i].earnings();
            System.out.println("月工资为：" + salary);
            if(month == emps[i].getBirthday().getMonth()){
                System.out.println("生日快乐，奖励100元！");
            }
        }
    }
}
