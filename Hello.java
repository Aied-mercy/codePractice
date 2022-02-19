public class Hello{
	public static void main(String[] args){
		int oddSum = 0;
		int evenSum = 0;
		for(int i=0;i<100;i++)
		{
			if(i%2==1)
			{
				evenSum +=i;
			}
			else
			{
				oddSum +=i;
			}
		}
		System.out.println("奇数的和："+evenSum);
		System.out.println("偶数的和："+oddSum);
	}
}