package 面向对象_04_;
import javax.swing.plaf.synth.SynthOptionPaneUI;
/*建立InstanceTest类，在类中定义方法method(Person e);
        在method中:
        ( 1 )根据e的类型调用相应类的getInfo( )方法。
        ( 2 )根据e的类型执行:
        如果e为Person类的对象，输出:
        “a person“;
        如果e为Student类的对象，输出:
        ”a student“
        “a person”
        如果e为Graduate类的对象，输出:
        ”a graduated student"
        “a student”
        “a person”                */
public class Instance_Test  {
    public static void main(String[] args) {
        Instance_Test test = new Instance_Test();
        test.method(new Student());
    }
    public void method(Person e){
        // 虚拟方法调用
        String info = e.getInfo();
        System.out.println(info);
        //写法：方式一
        if(e instanceof Graduate){
            System.out.println("a graduate student");
            System.out.println("a student");
            System.out.println("a person");
        }else if(e instanceof Student){
            System.out.println("a student");
            System.out.println("a person");
        }else{
            System.out.println("a person");
        }
        //写法二：方式二
        /*
        if( e instanceof Graduate ){
            System.out.println("a graduate student");
        }
        if( e instanceof Student ){
            System.out.println("a student");
        }
        if( e instanceof Person ){
            System.out.println("a person");
        }
        */
    }
}
class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}
class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "Name: " + name + "Inage: " + age
                + "\nschool: " + school;
    }
}
class Graduate extends Student{
    public String major="IT";
    public String getInfo(){
    return "Name: "+ name + "\nage: "+ age + "Inschool: "+
                school+"nmajor:"+major;
        }
}

