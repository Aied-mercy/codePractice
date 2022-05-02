package 面向对象_03_;
public class Kids extends ManKind{
    private int yearOld;

    public Kids(){   //提供空参的构造器
    }
    public Kids(int yearOld){   //初始化
        this.yearOld = yearOld;
    }

    public void printAge(){
        System.out.println("I am "  + yearOld  +  " years old. ");
    }

    public void setYearOld(int yearOld){
        this.yearOld = yearOld;
    }
    public int getYearOld(){
        return yearOld;
    }
}
