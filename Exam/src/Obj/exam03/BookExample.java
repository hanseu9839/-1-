package Obj.exam03;

public class BookExample {

	public static void main(String[] args) {
		Book b=new Book("바다이야기","강은화",200);
		Book[] book=new Book[5];
		book[0]=new Book("바다이야기","강은화",200);
		book[1]=new Book("삼룡","한승균",100);
		b.bookData1(book);
		
	
	}

}
