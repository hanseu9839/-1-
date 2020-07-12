package Re;

public class Cat extends Animal{
	Cat(){
		this.kind="포유류";
	}
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	@Override
	public void eat() {
			System.out.println("고양이처럼 먹습니다.");
	}
}
