package Java数组_01;

public class practice_02 {
    public static void main(String[] args) {
        /*
        升景坊单间短期出租4个月，550元/月（水电煤公摊，网费35元/月），
        空调、卫生间、厨房齐全。屋内均是IT行业人，喜欢安静。
        所以要求来租者最好是同行或者刚毕业的年轻人，爱干净、安静。
        以下是我的联系方式：
         */
        int[] arr = new int[]{8,2,1,0,3};
        int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
        String tel = "";
        for(int i = 0;i <index.length;i++)
        {
            tel += arr[index[i]];
        }
        System.out.println("联系方式："+tel);
    }
}