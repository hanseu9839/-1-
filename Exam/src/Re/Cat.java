package Re;

public class Cat extends Animal{
	Cat(){
		this.kind="������";
	}
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
	@Override
	public void eat() {
			System.out.println("�����ó�� �Խ��ϴ�.");
	}
}
