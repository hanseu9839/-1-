package study;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		
		while(true)
		{
			input=sc.nextLine();
			System.out.println("�Էµ� ���ڿ� \""+input+"\"");
			if(input.equals("q")) {
				break;
			}
				}
		System.out.println("����");
	}

}
