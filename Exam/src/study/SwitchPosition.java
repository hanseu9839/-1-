package study;

import java.util.Scanner;

public class SwitchPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�.������ �˷��帳�ϴ�.");
		String position = sc.nextLine();
		
		switch(position) {
		case "����":
			System.out.println("������ ������ 1000�����Դϴ�.");
		case "�̻�":
			System.out.println("�̻��� ������ 800�����Դϴ�.");
		case "����":
			System.out.println("������ ������ 600�����Դϴ�.");
		case "����":
			System.out.println("500�����Դϴ�.");
		default:
			System.out.println("�����Դϴ�.");
		}
		
		

	}

}
