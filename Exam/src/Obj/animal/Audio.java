package Obj.animal;

public class Audio implements RemoteControl,Login{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
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
	System.out.println("현재 Audio의 볼륨 : "+volume);	
		
	}
	
	public void changeCh() {
		System.out.println("채널을 바꿉니다.");
	}
	@Override
	public void login(String id, String password) {
		if(id=="hans") {
			if(password=="1234") {
				System.out.println("로그인 되었습니다.");
			}else {
				System.out.println("비밀번호가 오류났습니다.");
			}
		
	}else {
		System.out.println("아이디 오류");
	}	
	}
}
