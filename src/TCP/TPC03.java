package TCP;

import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		// ���踦 �����϶�. PDT  VS  UDDT ��
		// ����1���� �����ϱ����� ������ �����Ͻÿ�.
		int a;
		a=10;
		//å 1���� �����ϱ����� ������ �����Ͻÿ�.
		Book b;
		b = new Book();
		b.title="�ڹ�";
		b.price = 15000;
		b.company="�Ѻ��̵��";
		b.page = 700;
		
		System.out.println(b.title);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);
		
		PersonVO p;
		p= new PersonVO();
		p.name="�ѽ±�";
		p.age= 25;
		p.weight=68.4f;
		p.height=175.8f;
		
		System.out.print(p.name+"\t");
		System.out.print(p.age+"\t");
		System.out.print(p.weight+"\t");
		System.out.print(p.height+"\t");
		
	}

}
