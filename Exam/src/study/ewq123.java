package study;



public class ewq123 {

	public static void main(String[] args) {
		
		String name1 ="�Ź�ö";
		String name2 ="�Ź�ö";
		
		if(name1==name2)
		{
			System.out.println("�������� �����մϴ�.\n");
		}else {
			System.out.println("�������� �ٸ��ϴ�.\n");
		}
		
		String str1 = "�Ź�ö";
		String str2 = new String("�Ź�ö");
		if(str1==str2) {
			System.out.println("�������� �����մϴ�.\n");
		}else {
			System.out.println("�������� �ٸ��ϴ�.\n");
		}
		if(str1.equals(str2)) {
			System.out.println("���ڿ��� �����մϴ�.");
		}else {
			System.out.println("���ڿ��� �ٸ��ϴ�.");
		}
}
}
