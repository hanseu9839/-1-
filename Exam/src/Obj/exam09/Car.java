package Obj.exam09;

public class Car {
	Tire frontLeftTire = new Tire("�տ���",3);
	Tire frontRightTire = new Tire("�տ�����",2);
	Tire backLeftTire = new Tire("�ڿ���",7);
	Tire backRightTire = new Tire("�ڿ�����",4);
	
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRightTire.roll()==false) {stop(); return 2;}
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		return 0;
	}
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
