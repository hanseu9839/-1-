package Obj.car;

public class Bus extends Vehicle{
	String model="����";
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	@Override
	public void currSpeed(int speed) {
		if(speed>0) {
		System.out.println(model+"������ �ӵ���  : "+speed);
		}else {
			stop();
		}
	}
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}
	
	
}
