package Obj.animal;

public class Audio implements RemoteControl,Login{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME) {
			this.volume=MAX_VOLUME;
		}else if(volume<MIN_VOLUME){
			this.volume=MIN_VOLUME;
		}else {
			this.volume=volume;
		}
	System.out.println("���� Audio�� ���� : "+volume);	
		
	}
	
	public void changeCh() {
		System.out.println("ä���� �ٲߴϴ�.");
	}
	@Override
	public void login(String id, String password) {
		if(id=="hans") {
			if(password=="1234") {
				System.out.println("�α��� �Ǿ����ϴ�.");
			}else {
				System.out.println("��й�ȣ�� ���������ϴ�.");
			}
		
	}else {
		System.out.println("���̵� ����");
	}	
	}
}
