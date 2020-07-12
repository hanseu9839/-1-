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
		System.out.println("고양이가 밥을 먹어요");
	}

	@Override
	public void breath() {
		System.out.println("고양이가 숨을 쉽니다.");
		
	}

	@Override
	public void sleep() {
		System.out.println("고양이가 잠을 잡니다.");
		
	}

	@Override
	public void wake() {
		System.out.println("고양이가 잠에서 일어납니다.");
		
	}
	public void shake() {
		System.out.println("고양이가 몸을 배배꼽니다.");
	}

	
}
