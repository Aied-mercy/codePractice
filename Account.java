package 面向对象_02_封装性;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
  //这个构造器 初始化属性
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;   //账号
        this.balance = balance;   //余额
        this.annualInterestRate = annualInterestRate;  //年利率
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    //在提款方法withdraw中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
    public void withdraw(double amount)   //取钱
    {
        if(balance < amount  ){
            System.out.println("余额不足，取款失败！！！");
            return ;
        }
        balance -= amount;
        System.out.println("成功取出:" + amount);
    }
    public void deposit(double amount)    //存钱
    {
        if(amount > 0 ){
            balance += amount;
            System.out.println("成功存入：" + amount);
        }
    }
}











