package TCP;

import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		// 관계를 이해하라. PDT  VS  UDDT 비교
		// 정수1개를 저장하기위한 변수를 선언하시오.
		int a;
		a=10;
		//책 1권을 저장하기위한 변수를 선언하시오.
		Book b;
		b = new Book();
		b.title="자바";
		b.price = 15000;
		b.company="한빛미디어";
		b.page = 700;
		
		System.out.println(b.title);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);
		
		PersonVO p;
		p= new PersonVO();
		p.name="한승균";
		p.age= 25;
		p.weight=68.4f;
		p.height=175.8f;
		
		System.out.print(p.name+"\t");
		System.out.print(p.age+"\t");
		System.out.print(p.weight+"\t");
		System.out.print(p.height+"\t");
		
	}

}
