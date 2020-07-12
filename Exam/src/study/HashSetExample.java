package study;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("ÇÑ½Â±Õ");
		set.add("°­ÀºÈ­");
		set.add("µÕµÕÀÌ");
		set.add("»ÇÂ¦ÀÌ");
		set.add("»ÇÂ¦¶×¶×ÀÌ");
		
		int size = set.size();
		System.out.println("ÃÑ °´Ã¼ÀÇ ¼ö" + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("»ÇÂ¦¶×¶×ÀÌ");
		set.remove("ÇÑ½Â±Õ");
		System.out.println("ÃÑ °´Ã¼¼ö : "+size);
		
		iterator = set.iterator();
		for(String element:set) {
			System.out.println("\t"+ element);
		}
		
		set.clear();
		if(set.isEmpty()) {System.out.println("ºñ¾î ÀÖÀ½");}
	}

	
	

}
