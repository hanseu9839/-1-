package Obj.exam03;

public class Book {
	String title="�ޱ�";
	String author="�±�";
	int page=100;
	
	Book(String title,String author,int page){
		this.title=title;
		this.author=author;
		this.page=page;
	}
	public void bookData1(Book[] books) {
		for(int i=0;i<books.length;i++)
		{
			System.out.println(books[i]);
		}
	}
	
	public void bookData2(Book ...books) {
		for(int i=0;i<books.length;i++)
		{
			System.out.println(books[i]);
		}
	}
}
