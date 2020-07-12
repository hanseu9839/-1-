package Obj.exam09;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1;i<=5;i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� HankookTire�� ��ü");
				car.frontLeftTire = new HankookTire("�տ���",15);
				break;
			case 2:
				System.out.println("�տ����� KumhooTire�� ��ü");
				car.frontRightTire = new KumhoTire("��������",13);
				break;
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
				car.backLeftTire = new HankookTire("�ڿ���",15);
				break;
			case 4:
				System.out.println("�ڿ����� KumhooTire�� ��ü");
				car.backRightTire = new KumhoTire("�ڿ�����",11);
				break;
			}
			System.out.println("-------------------------------------------------------------------------");
		}

	}

}
