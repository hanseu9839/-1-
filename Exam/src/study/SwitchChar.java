package study;

import java.util.Scanner;

public class SwitchChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ȸ���� ����� �Է��Ͻÿ�.(A,B)\n");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "A":
		case "a":
			System.out.println("���ȸ���Դϴ�.");
			break;
		case "B":
		case "b":
			System.out.println("�Ϲ�ȸ���Դϴ�.");
			break;
		default :
			System.out.println("ȸ���� �ƴմϴ�.");
		
		
		}
			
		

	}

}
