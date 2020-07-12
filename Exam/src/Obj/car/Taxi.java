package Obj.car;

public class Taxi extends Vehicle{
	String model="택시";
	
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

	@Override
	public void currSpeed(int speed) {
		System.out.println(model+"의 현재 속도는 : "+speed);
		
	}

	
}
