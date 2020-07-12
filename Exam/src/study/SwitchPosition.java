package study;

import java.util.Scanner;

public class SwitchPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("직급을 입력하시오.연봉을 알려드립니다.");
		String position = sc.nextLine();
		
		switch(position) {
		case "사장":
			System.out.println("사장의 월급은 1000만원입니다.");
		case "이사":
			System.out.println("이사의 월급은 800만원입니다.");
		case "팀장":
			System.out.println("팀장의 월급은 600만원입니다.");
		case "과장":
			System.out.println("500만원입니다.");
		default:
			System.out.println("미정입니다.");
		}
		
		

	}

}
