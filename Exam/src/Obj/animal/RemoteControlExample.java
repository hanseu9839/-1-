package Obj.animal;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc ;
		rc = new Television();
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		//rc.changeCh();
		Audio a = (Audio) rc;
		a.changeCh();

	}

}
