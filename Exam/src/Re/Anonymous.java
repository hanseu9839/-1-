package Re;


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
	
	public void method1() {
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
			}
		};
	}
	
	public void method2(RemoteControl rc) {
		rc.turnOn();
	}

}
