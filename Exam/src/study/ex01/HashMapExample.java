package study.ex01;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("�ſ��", 85);
		map.put("�ѽ±�",100);
		map.put("���ǻ�",100);
		map.put("�뵿��",80);
		
		
		
		System.out.println("�� Entry�� : " + map.size());
	
		System.out.println("\tȫ�浿 : " +map.get("ȫ�浿"));
		System.out.println();
		
		Set <String,Integer> KeySet = map.keySet();
		
	}
}
