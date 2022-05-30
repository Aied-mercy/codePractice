package 面向对象_04_;

public class Test_bank_ {
    private int id;
    private String pwd = "000000";
    private double balance;

    private static double interestRate;
    private static double minMoney = 1.0;
    private static int init = 1001;   //用于自动生成 id 使用的

    public Test_bank_(){
        id = init++;
    }
    public Test_bank_(String pwd,double balance){
        id = init++;
        this.pwd = pwd;
        this.balance = balance;
    }

    public static void setInterestRate(double interestRate) {
        Test_bank_.interestRate = interestRate;
    }
    public static double getInterestRate() {
        return interestRate;
    }
    public static void setMinMoney(double minMoney) {
        Test_bank_.minMoney = minMoney;
    }
    public static double getMinMoney() {
        return minMoney;
    }
    public double getBalance() {
        return balance;
    }
    public int getId() {
        return id;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString(){
        return "Test_bank_[id = "+id + ",pwd = " + pwd +",balance = "+ balance+"]";
    }
}

