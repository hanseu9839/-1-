package interCar;

public class Cat implements Animal{
	private int age;
	private String name;
	
	Cat(int age,String name){
		this.age = age;
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println("����̰� ���� �Ծ��");
	}

	@Override
	public void breath() {
		System.out.println("����̰� ���� ���ϴ�.");
		
	}

	@Override
	public void sleep() {
		System.out.println("����̰� ���� ��ϴ�.");
		
	}

	@Override
	public void wake() {
		System.out.println("����̰� �ῡ�� �Ͼ�ϴ�.");
		
	}
	public void shake() {
		System.out.println("����̰� ���� ���Ŵϴ�.");
	}

	
}
