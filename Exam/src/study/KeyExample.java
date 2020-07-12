package study;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();

			hashMap.put(new Key(0), "ȫ�浿");
			
			String value = hashMap.get(new Key(0));
			System.out.println(value);
	}

}
