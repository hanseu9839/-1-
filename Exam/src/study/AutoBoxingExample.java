package study;

public class AutoBoxingExample {

	public static void main(String[] args) {
		System.out.println("-128~127초과 값일 경우");
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println("==결과 : " + (obj1==obj2));
		System.out.println("언박싱한 후 ==결과 "+(obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과 : " + obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[-128~127범위 값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: "+ (obj3==obj4));
		System.out.println("언박싱한 후 결과: "+ (obj3.intValue()==obj4.intValue()));
		System.out.println("equals() 결과 :" +obj3.equals(obj4));
		
		
	
	}

}
