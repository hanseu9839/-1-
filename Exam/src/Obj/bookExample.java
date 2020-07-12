package Obj;

public class bookExample {

	public static void main(String[] args) {
		book b = new book();
		
		b.author="한승균";
		b.bkname="나노";
		b.page=800;
		
		System.out.println("작가이름: "+b.author);
		System.out.println("책이름 : "+b.bkname);
		System.out.println("페이지수 : " +b.page);

	}

}
