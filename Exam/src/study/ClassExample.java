package study;

import interCar.Car;

public class ClassExample {

	public static void main(String[] args) throws Exception{
		//Class clazz = Car.class;
		
		Class clazz = Class.forName("interCar.Car");
		
		//Car car = new Car();
		//Class clazz = car.getClass();
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		
	}

}
