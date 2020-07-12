package Obj.car;

public  class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰을 잠시 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰을 잠시 끕니다.");
	}
}
