package Obj.car;

public class typeExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		if(parent instanceof Child) {
			System.out.println("�ڽİ�ü�� �θ��� ��ü�� �ڵ�����ȯ �Ǿ��ֽ��ϴ�.");
		}else {
			System.out.println("��ü��������");
		}

	}

}
