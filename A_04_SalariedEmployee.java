package Java基础_05;
/*
定义SalariedEmployee类继承Employee类，实现按月计算工资的员工处理。
该类包括：private成员变量monthSalary值。
实现父类的抽象方法earnings()，该方法返回monthlySalary值，
toString()方法输出员工类型信息及员工的name,number,birthday
 */
public class A_04_SalariedEmployee extends A_04_Employee{
    private double monthlySalary;//月工资

    public  A_04_SalariedEmployee(String name,double number,A_04_Mydate birthday,double monthlySalary){
        super(name,number,birthday);
        this.monthlySalary = monthlySalary;
    }
    public void setMonthlySalary(int monthlySalary){
        this.monthlySalary = monthlySalary;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
    public String toString(){
        return "SalariedEmployee["+ super.toString() + "]";
    }
    @Override   //重写抽象方法
    public double earnings(){
        return monthlySalary;
    }
}
