package interCar;

public class Car {
	Tire frontLeftTire = new  HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new KumhoTire();
	Tire backRightTire = new KumhoTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backRightTire.roll();
		backLeftTire.roll();
	}
}
