package study;

public class ArrayCopy {

	public static void main(String[] args) {
		int []Oldarr = {10,20,30};
		int []Newarr= new int[5];
		
		for(int i=0;i<Oldarr.length;i++)
		{
			Newarr[i]=Oldarr[i];
			
		}
		
		for(int i=0;i<Newarr.length;i++) {
			System.out.println(Newarr[i]);
		}

	}

}
