package study;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("�ѽ±�");
		set.add("����ȭ");
		set.add("�յ���");
		set.add("��¦��");
		set.add("��¦�׶���");
		
		int size = set.size();
		System.out.println("�� ��ü�� ��" + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("��¦�׶���");
		set.remove("�ѽ±�");
		System.out.println("�� ��ü�� : "+size);
		
		iterator = set.iterator();
		for(String element:set) {
			System.out.println("\t"+ element);
		}
		
		set.clear();
		if(set.isEmpty()) {System.out.println("��� ����");}
	}

	
	

}
