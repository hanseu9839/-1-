package TPC;



public class TPC39 {

	public static void main(String[] args) {
		int a = 1;
		//Integer b = 1; //Boxing(기법)  굳이 Integer b = new Integer(1); 컴파일러가 내부적으로 new Integer해준다. 
		Integer b = new Integer(1);
		System.out.println(b.intValue());
		System.out.println(b.toString());
		
		Object[] obj = new Object[7];
		//1,2,3 을 Object에 넣어주고 싶을 때 박싱해준다. 왜냐면 클래스만 넣어줄수있기떄문에 
		
		obj[0] =new Integer(1);
		obj[1] =new Integer(2);
		obj[2] =new Integer(3);
		obj[3] = 2;
		obj[4] = 5;
		obj[5] = 7;
		
		//부모 		자식 
		System.out.println(obj[0].toString());
		System.out.println(obj[1].toString());
		System.out.println(obj[2].toString());//부모가 가지고 있는 toString을 자식이 재정의하여 toString 즉, integer의 클래스에 toString 재정의 되어있다.
		System.out.println(obj[4]);
		System.out.println(obj[5]);
		
		//toString은 생략할 수 있다. 
		// "100" + "100" = 200
		//위에를 정수 100으로 바꿔야된다. 결합이 되어서  100100이된다.
		String x = "100";
		String y = "100";
		int val1 = Integer.parseInt(x);//parseInt는 스태틱메소드이다.숫자로 되어있는 문자열을 숫자로 바꿔준다. 
		int val2 = Integer.parseInt(y);
		
		System.out.println(val1+val2);
		String s1 = String.valueOf(val1);
		String s2 = String.valueOf(val2);
		System.out.println(s1+s2);
	}

}
