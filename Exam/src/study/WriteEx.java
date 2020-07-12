package study;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Users/han/Desktop/test2.db");
		
		byte[] array = {10,20,30};
		os.write(array);
		
		os.flush();
		os.close();

	}

}
