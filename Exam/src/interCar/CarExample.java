package interCar;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.backLeftTire = new HankookTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();

	}

}
