package TPC;

import java.util.*;

public class TPC38 {

	public static void main(String[] args) {
		 List <BookDTO>list = new ArrayList<BookDTO>();
		 list.add(new BookDTO("�ڹ�", 12000, "���",600));
		 list.add(new BookDTO("C���", 17000, "������",700));
		 list.add(new BookDTO("Python", 15000, "������",690));
		 
		 for(int i=0; i<list.size();i++) {
			 //Object o=list.get(i);
			 BookDTO vo = list.get(i);
			 System.out.println(vo.title+"\t"+vo.price+"\t"+vo.company+"\t"+vo.page);
		 }

	}

}
