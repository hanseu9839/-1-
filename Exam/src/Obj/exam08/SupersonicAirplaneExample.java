package Obj.exam08;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersoincAirplane sa = new SupersoincAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode= SupersoincAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode= SupersoincAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
