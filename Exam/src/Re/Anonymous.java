package Re;


public class Anonymous {
	RemoteControl field = new RemoteControl() {
		@Override 
		public void turnOn() {
			System.out.println("TVÀ» ÄÕ´Ï´Ù.");
		}
		public void turnOff() {
			System.out.println("TVÀ» ²ü´Ï´Ù.");
		}
	};
	
	public void method1() {
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio¸¦ ²ü´Ï´Ù.");
			}
		};
	}
	
	public void method2(RemoteControl rc) {
		rc.turnOn();
	}

}
