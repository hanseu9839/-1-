package study.ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasgMapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("½Å¿ë±Ç", 85);
		map.put("ÇÑ½Â±Õ",100);
		map.put("°­»Ç»Ç",100);
		map.put("±ëµ¿±æ",80);
		
		
		
		System.out.println("ÃÑ Entry¼ö : " + map.size());
	
		System.out.println("\tÈ«±æµ¿ : " +map.get("È«±æµ¿"));
		System.out.println();
		
		 Set<String> keySet = map.keySet();
		 Iterator<String> keyIterator = keySet.iterator();
		 while(keyIterator.hasNext()) {
			 String key = keyIterator.next();
			 Integer value = map.get(key);
			 System.out.println("\t"+ key + " : " + value);
		 }
		 System.out.println();
		 map.remove("½Å¿ë±Ç");
		 System.out.println("ÃÑ Entry ¼ö: " +map.size());
		 
		 Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		 Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		 
		 while(entryIterator.hasNext()) {
			 Map.Entry<String, Integer> entry = entryIterator.next();
			 String key = entry.getKey();
			 Integer value = entry.getValue();
			 System.out.println("\t" + key + " : " + value);
			 
		 }
		 System.out.println();
		 map.clear();
		 System.out.println("ÃÑ Entry¼ö: ");
		 
		 
	}
	
	
}
