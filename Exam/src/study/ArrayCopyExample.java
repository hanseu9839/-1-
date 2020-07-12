package study;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldArray= {"java","python","oracle"};
		
		String[] newArray=new String[5];
		
		System.arraycopy(oldArray, 0,newArray, 3, oldArray.length);

	}

}
