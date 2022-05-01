package Java数组_01;

public class practice_01 {
    public static void main(String[] args) {
        int[] ids = {2,3,4};
        int[] arr = new int[]{1,2,3};     //静态初始化
        String[] names = new String[5];  //动态初始化
        names[0] = "张三";    //给数组names 赋值
        names[1] = "李四";
        names[2] = "王五";
        names[3] = "老六";
        names[4] = "岳七";
        System.out.println(arr[0]);   //数组下标从0开始
        System.out.println(names.length);    //输出打印数组的长度
        for(int i=0;i<names.length;i++){    //遍历数组names
            System.out.println(names[i]);
        }
    }
}
