package Java基础_05;
/*
参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的员工处理。
该类包括：private成员变量wage 和 hour
实现父类的抽象方法earnings()，该方法返回wage * hour 值；
toString()方法输出员工类型信息及员工的name，number，birthday
 */
public class A_04_HourlyEmployee extends A_04_Employee{
    private int wage;
    private int hour;
    public A_04_HourlyEmployee(String name,int number ,A_04_Mydate birthday){
        super(name,number,birthday);
    }
    public A_04_HourlyEmployee(String name,int number,A_04_Mydate birthday,int wage,int hour){
        super(name,number,birthday);
        this.wage = wage;
        this.hour = hour;
    }
    public void setWage(int wage){
        this.wage = wage;
    }
    public int getWage(){
        return wage;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public int getHour(){
        return hour;
    }
    public double earnings(){
        return wage * hour;
    }
}
