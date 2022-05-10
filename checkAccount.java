package 面向对象_03_;
/*  创建一个类的子类checkAccount代表可透支的账户，
    该账户中定义一个属性overdraft代表可透支限额。
    如果 （取款金额 < 账户金额）
    可直接取款
    如果（取款金额 > 账户金额）
    计算需要透支的额度
    判断可透支额 overdraft 是否足够支付本次透支需要，如果可以
         将账户余额修改为 0 ，冲减可透支金额
    如果不可以，
         提示用户超过可透支额的限额     */
public class checkAccount extends Test_Account{
    private double overdraft;
    public checkAccount(int id, double balance, double annualInterestRate,double overdraft){
        super(id,balance,annualInterestRate);    //调用构造器
        this.overdraft = overdraft;
    }
    public void withdraw(double amount){
        if(getBalance() >= amount ){
            super.withdraw(amount);
        }
        else if(overdraft >= amount - getBalance()){//透支额度 + 余额足够消费
            overdraft -= (amount - getBalance());
            super.withdraw(getBalance());
        }else{
            System.out.println("超过可透支限额！" );
        }
    }
    public void setOverdraft(double overdraft){
        this.overdraft = overdraft;
    }
    public double getOverdraft(){
        return overdraft;
    }

}
