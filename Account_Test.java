package 面向对象_03_;

public class Account_Test {
   /*写一个用户程序测试Account类。在用户程序中，
   创建一个账号为1122、余额为20000、年利率4.5%的Account对象。
    再使用withdraw方法提款2500元，使用deposit方法存款3000元，
    然后打印余额和月利率。 */
   public static void main(String[] args) {
       Test_Account acct = new Test_Account(1122,20000,0.045);
       acct.withdraw(30000);
       System.out.println("你的账户余额为： " + acct.getBalance());
       acct.withdraw(2500);
       System.out.println("你的账户余额为： " + acct.getBalance());
       acct.deposit(3000);
       System.out.println("你的账户余额为： " + acct.getBalance());
       System.out.println("月利率为：" + (acct.getMonthlyInterest()*100) + "%");
   }
}
