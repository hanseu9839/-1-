package study.ex01;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("½Å¿ë±Ç", 85);
		map.put("ÇÑ½Â±Õ",100);
		map.put("°­»Ç»Ç",100);
		map.put("±ëµ¿±æ",80);
		
		
		
		System.out.println("ÃÑ Entry¼ö : " + map.size());
	
		System.out.println("\tÈ«±æµ¿ : " +map.get("È«±æµ¿"));
		System.out.println();
		
		Set <String,Integer> KeySet = map.keySet();
		
	}
}
