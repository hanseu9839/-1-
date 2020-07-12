package Obj.car;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Vehicle bus = new Bus();
		Vehicle taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		bus.currSpeed(30);
		//bus.stop();
		Bus b = (Bus)bus;
		b.stop();
		b.currSpeed(60);
		taxi.currSpeed(30);
		Taxi t = (Taxi)taxi;
		t.currSpeed(30);
		
		

	}

}
