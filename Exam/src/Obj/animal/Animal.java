package Obj.animal;

public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("���� ���ϴ�.");
	}
	public abstract void eat();
	public abstract void sound();
}
