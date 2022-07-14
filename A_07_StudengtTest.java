package Java基础_05;

public class A_07_StudengtTest {
    public static void main(String[] args) {
        try{
            person  p = new person();
            p.method(-1001);
            System.out.println(p);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


        //System.out.println(p);
    }
}
//throw 和 throws  不同
  //throw 是抛出异常
//  throws 是处理异常
class person{
    private int id;
    public void method(int id)  throws Exception{
        if(id > 0){
            this.id = id;
        }else{
            //System.out.println("输入的数据有误！");
             throw new Exception("输入的数据有误！");
        }
    }
    //IDEA 快捷键 写 to String 方法 ( alt + Ins ScrLK  就行)
    @Override
    public String toString() {
        return "person{" + "id=" + id + '}';
    }
}
