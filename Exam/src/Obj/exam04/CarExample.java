package Obj.exam04;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setGas(6);
		boolean gasState=myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas주입할 필요없다.");
		}else {
			System.out.println("가스를 주입하세요.");
		}

	}

}
