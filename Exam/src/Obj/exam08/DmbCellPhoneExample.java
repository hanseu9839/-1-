package Obj.exam08;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone ��ü ���� 
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���","����",100);
		
		System.out.println("�� : "+ dmbCellPhone.model);
		System.out.println("���� : "+ dmbCellPhone.color);
		System.out.println("ä�� : "+dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���!���� �±����Դϴ�.");
	}

}
