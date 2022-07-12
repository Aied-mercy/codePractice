package Java基础_05;
/*
Mydate类包含：private成员变量 year，month，day
toDateString()方法返回日期对应的字符串：xxxx年xx月xx日。
 */
public class A_04_Mydate {
    private int year;
    private int month;
    private int day;

    public A_04_Mydate(int year,int month,int day){
        super();
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }

    public String toDataString(){
        return year +"年"+ month + "月" + day + "日";
    }
}
