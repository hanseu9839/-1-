package study;

import java.util.Scanner;

public class SwitchChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("회원의 등급을 입력하시오.(A,B)\n");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "A":
		case "a":
			System.out.println("우수회원입니다.");
			break;
		case "B":
		case "b":
			System.out.println("일반회원입니다.");
			break;
		default :
			System.out.println("회원이 아닙니다.");
		
		
		}
			
		

	}

}
