package 面向对象_02_封装性;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane","Smith");
        Account acct = new Account(1000,2000,0.0123);
        cust.setAccount(acct);
         //将acct的地址通过set方法赋给了account，就可以访问 Account 类
          //相当于 Customer 可以直接访问 Account
        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);

    }
}
