package Obj.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.powerOn();
		int result1 = cal.plus(10, 20);
		double result2=cal.divide(10, 20);
		
		System.out.println("�� ���� ���� : "+result1);
		System.out.println("�� ���� �������� : "+result2);
		cal.powerOff();
	}

}
