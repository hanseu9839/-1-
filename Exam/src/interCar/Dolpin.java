package interCar;

public class Dolpin implements Animal{
	private String name;
	private int age;
	Dolpin(String name,int age){
		this.age =age;
		this.name = name;
	}
	
	
	@Override
	public void eat() {
		System.out.println("������ ���� �Ծ��");
		
	}

	@Override
	public void breath() {
		System.out.println("������ ���� ���� �������� �ö�ɴϴ�.");
		
	}

	@Override
	public void sleep() {
		System.out.println("������ ���� ��ϴ�.");
		
	}

	@Override
	public void wake() {
		System.out.println("������ �Ͼ�ϴ�.");
		
	}
	public void dance() {
		System.out.println("������ ���� ��ϴ�.");
	}
	
	
}
