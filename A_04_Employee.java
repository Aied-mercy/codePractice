package Java基础_05;
/*
定义一个Employee类，该类包含：private成员name，number，birthday，
其中birthday 为 Mydate 类的对象，abstract方法 earnings()；
toString()方法 输出对象的name，number和birthday
 */
public abstract class A_04_Employee {
    private String name;
    private double number;
    private A_04_Mydate birthday;
    public A_04_Employee(){
    }
    public A_04_Employee(String name,double number,A_04_Mydate birthday){
        super();
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }
    public void setName(String name){
        this.name = name ;
    }
    public String getName(){
        return name;
    }
    public void setNumber(int number){
        this.number = number ;
    }
    public double getNumber(){
        return number;
    }
    public void setBirthday(A_04_Mydate birthday){
        this.birthday = birthday;
    }
    public A_04_Mydate getBirthday(){
        return birthday;
    }
    public abstract double earnings();
    @Override
    public String toString(){
        return "[name="+ name +",number="+ number +",birthday="+ birthday.toDataString()+"]";
    }
}


