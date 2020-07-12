package Obj.exam08;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성 
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",100);
		
		System.out.println("모델 : "+ dmbCellPhone.model);
		System.out.println("색상 : "+ dmbCellPhone.color);
		System.out.println("채널 : "+dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요!저는 승균이입니다.");
	}

}
