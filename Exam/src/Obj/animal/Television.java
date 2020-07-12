package Obj.animal;

public class Television implements RemoteControl,Login{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
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
	System.out.println("현재 TV의 볼륨 : "+volume);	
	}
	
	public void movie() {
		System.out.println("영화관모드로 바꿉니다.");
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
