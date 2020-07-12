package Obj.car;

public class Vehicle {
	int speed;
	String model;
	public void run() {
		System.out.println("자동차가 달립니다.");
	}
	public void currSpeed(int speed) {
		System.out.println("자동차의 현재속도는 :"+speed);
	}
}
