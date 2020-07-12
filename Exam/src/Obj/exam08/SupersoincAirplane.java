package Obj.exam08;

public class SupersoincAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음 속 비행을 합니다.");
		}else {
		super.fly();
		}
	}
	
	
}
