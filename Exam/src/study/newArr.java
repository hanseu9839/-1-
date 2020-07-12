package study;

public class newArr {

	public static void main(String[] args) {
		int [] arr1;
		arr1 = new int[3];
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		float []arr2=new float[3];
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		arr2[0]=0.2f;
		arr2[1]=0.1f;
		arr2[2]=0.3f;
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
		String []str3=new String[3];
		for(int i=0;i<str3.length;i++)
		{
			System.out.println(str3[i]);
		}
		
		str3[1]="자바";
		str3[0]="파이썬";
		str3[2]="오라클";
		for(int i=0;i<str3.length;i++) {
			System.out.println(str3[i]);
		}
		
	}

}
