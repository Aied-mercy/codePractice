package 面向对象_03_;
public class ManKind {
    private int sex;  //性别
    private int salary;   //薪资

    public ManKind(){   //空参的构造器
    }

    public ManKind(int sex,int salary){
        this.sex = sex;
        this.salary = salary;
    }

    public void manorWoman(){
        if(sex ==1){
            System.out.println("man");
        }else if(sex == 0){
            System.out.println("woman");
        }
    }
    public void employeed(){
        if(salary == 0){
            System.out.println("no job");
        }else if(salary == 1){
            System.out.println("job");
        }
        // 这个也可以使用三目运算符
        /* String jobInfo = (salary == 0)? "no job":"job";
        System.out.println(jobInfo);   */
    }
    public void setSex(int sex){
        this.sex = sex;
    }
    public int getSex(){
        return sex;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }

}
