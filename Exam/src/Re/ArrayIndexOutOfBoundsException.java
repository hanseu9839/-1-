package Re;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "a100";
		
		int data3 = Integer.parseInt(data1);
		int data4 = Integer.parseInt(data2);

		int result = data3 + data4;
		
		System.out.println(data3+ "+" +data4 +"="+result);
		}
	}


