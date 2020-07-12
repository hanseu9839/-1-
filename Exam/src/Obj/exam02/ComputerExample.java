package Obj.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		Computer com = new Computer();
		int[] values= {1,2,3};
		int result1=com.plus1(values);
		System.out.println(result1);
		int result2=com.plus1(new int[] {1,2,3,4,5});
		System.out.println(result2);
		
		int result3=com.plus2(1,2,3);
		System.out.println(result3);
	
		
	}

}
