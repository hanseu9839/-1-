package Obj.car;

public class Bus extends Vehicle{
	String model="버스";
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	@Override
	public void currSpeed(int speed) {
		if(speed>0) {
		System.out.println(model+"현재의 속도는  : "+speed);
		}else {
			stop();
		}
	}
	public void stop() {
		System.out.println("버스가 멈춥니다.");
	}
	
	
}
