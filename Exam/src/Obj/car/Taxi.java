package Obj.car;

public class Taxi extends Vehicle{
	String model="�ý�";
	
	@Override
	public void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}

	@Override
	public void currSpeed(int speed) {
		System.out.println(model+"�� ���� �ӵ��� : "+speed);
		
	}

	
}
