package study;

public class sumArray {

	public static void main(String[] args) {
		
		int sum1 =add(new int[] {10,20,30});
		System.out.println(sum1);
		sumArray  arr=new sumArray();
		double avg =arr.avg(new int[] {10,20,30});
		System.out.println(avg);
	}
	public static int add(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum; 
	}
	public double avg(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{sum+=arr[i];}
		
		return sum/3.0;
	}
}

