package study;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myphone = new SmartPhone("구글","안드로이드");
		
		String strObj = myphone.toString();
		System.out.println(strObj);
		
		System.out.println(myphone);

	}

}
