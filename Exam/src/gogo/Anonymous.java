package gogo;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
			}
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
			}
		};
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
