package Obj.animal;

public class Television implements RemoteControl,Login{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
		
	}
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
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
	System.out.println("���� TV�� ���� : "+volume);	
	}
	
	public void movie() {
		System.out.println("��ȭ������ �ٲߴϴ�.");
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
