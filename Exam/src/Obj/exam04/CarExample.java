package Obj.exam04;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setGas(6);
		boolean gasState=myCar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas������ �ʿ����.");
		}else {
			System.out.println("������ �����ϼ���.");
		}

	}

}
