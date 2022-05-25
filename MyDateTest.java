package 面向对象_04_;
   // 重写 equals（）方法 运行结果会改变
public class MyDateTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(12,3,1976);
        MyDate m2 = new MyDate(14,3,1976);
        if(m1 == m2){
            System.out.println("m1 == m2");
        }else{
            System.out.println("m1 != m2");
        }
        if(m1.equals(m2)){
            System.out.println("m1 is equal to m2");
        }else {
            System.out.println("m1 is not equal to m2");
        }
    }
}

class  MyDate{
    private int day;
    private int month;
    private double year;
    public MyDate(int day,int month,double year){
        super();
        this.day = day;     //初始化
        this.month = month;
        this.year = year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay() {
        return day;
    }
    public void setYear(double year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public double getYear() {
        return year;
    }

    @Override     //重写 equals 方法
    public boolean equals (Object obj) {
        if (this ==
                obj)
            return true;
        if (obj == null )
            return false;
        if (getClass() != obj. getClass())
            return false;
        MyDate other = (MyDate) obj;
        if (day != other .day)
            return false ;
        if ( month != other . month)
            return false;
        if (year != other.year)
            return false ;
        return true ;
    }
}
