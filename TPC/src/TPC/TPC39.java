package TPC;



public class TPC39 {

	public static void main(String[] args) {
		int a = 1;
		//Integer b = 1; //Boxing(���)  ���� Integer b = new Integer(1); �����Ϸ��� ���������� new Integer���ش�. 
		Integer b = new Integer(1);
		System.out.println(b.intValue());
		System.out.println(b.toString());
		
		Object[] obj = new Object[7];
		//1,2,3 �� Object�� �־��ְ� ���� �� �ڽ����ش�. �ֳĸ� Ŭ������ �־��ټ��ֱ⋚���� 
		
		obj[0] =new Integer(1);
		obj[1] =new Integer(2);
		obj[2] =new Integer(3);
		obj[3] = 2;
		obj[4] = 5;
		obj[5] = 7;
		
		//�θ� 		�ڽ� 
		System.out.println(obj[0].toString());
		System.out.println(obj[1].toString());
		System.out.println(obj[2].toString());//�θ� ������ �ִ� toString�� �ڽ��� �������Ͽ� toString ��, integer�� Ŭ������ toString ������ �Ǿ��ִ�.
		System.out.println(obj[4]);
		System.out.println(obj[5]);
		
		//toString�� ������ �� �ִ�. 
		// "100" + "100" = 200
		//������ ���� 100���� �ٲ�ߵȴ�. ������ �Ǿ  100100�̵ȴ�.
		String x = "100";
		String y = "100";
		int val1 = Integer.parseInt(x);//parseInt�� ����ƽ�޼ҵ��̴�.���ڷ� �Ǿ��ִ� ���ڿ��� ���ڷ� �ٲ��ش�. 
		int val2 = Integer.parseInt(y);
		
		System.out.println(val1+val2);
		String s1 = String.valueOf(val1);
		String s2 = String.valueOf(val2);
		System.out.println(s1+s2);
	}

}
