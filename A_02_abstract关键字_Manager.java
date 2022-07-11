package Java基础_05;
//final 类   是不可以被继承的
//继承抽象类
//要注意重写抽象类中的抽象方法
public class A_02_abstract关键字_Manager extends A_02_abstract关键字_Employee {
    private double bonus;//奖金
    public A_02_abstract关键字_Manager(double bonus){
        super();
        this.bonus = bonus;
    }
    public A_02_abstract关键字_Manager(String name,int id,double salary,double bonus)
    {
        super(name,id,salary);
        this.bonus = bonus;
    }
    @Override
    public void work(){
        System.out.println("管理员工，提高公司的运行效率");
    }

}
