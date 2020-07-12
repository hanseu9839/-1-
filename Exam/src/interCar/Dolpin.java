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
		System.out.println("돌고래가 밥을 먹어요");
		
	}

	@Override
	public void breath() {
		System.out.println("돌고래가 숨을 쉬러 수면위로 올라옵니다.");
		
	}

	@Override
	public void sleep() {
		System.out.println("돌고래가 잠을 잡니다.");
		
	}

	@Override
	public void wake() {
		System.out.println("돌고래가 일어납니다.");
		
	}
	public void dance() {
		System.out.println("돌고래가 춤을 춥니다.");
	}
	
	
}
