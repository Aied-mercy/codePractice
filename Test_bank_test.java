package 面向对象_04_;
 //  体会静态结构的使用
public class Test_bank_test {
    public static void main(String[] args) {
        Test_bank_ bank1 = new Test_bank_();
        Test_bank_ bank2 = new Test_bank_("qwerty",2000);
        Test_bank_.setInterestRate(0.012);
        Test_bank_.setMinMoney(100);

        //如果没有对toString进行重写 ，那么输出bank1就是地址值
        System.out.println(bank1);
        System.out.println(bank2);

        System.out.println(bank1.getInterestRate());
        System.out.println(bank1.getMinMoney());

     }
}
