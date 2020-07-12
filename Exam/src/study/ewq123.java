package study;



public class ewq123 {

	public static void main(String[] args) {
		
		String name1 ="신민철";
		String name2 ="신민철";
		
		if(name1==name2)
		{
			System.out.println("번지수가 동일합니다.\n");
		}else {
			System.out.println("번지수가 다릅니다.\n");
		}
		
		String str1 = "신민철";
		String str2 = new String("신민철");
		if(str1==str2) {
			System.out.println("번지수가 동일합니다.\n");
		}else {
			System.out.println("번지수가 다릅니다.\n");
		}
		if(str1.equals(str2)) {
			System.out.println("문자열이 동일합니다.");
		}else {
			System.out.println("문자열이 다릅니다.");
		}
}
}
