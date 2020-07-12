package study;

public class SwitchNoBreak {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;
		System.out.println("현재 시간은 "+time+"시");
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("차를 한잔 합니다.");
		case 10:
			System.out.println("일을 합니다.");
		case 11:
			System.out.println("외근을 나갑니다.");
		default:
			System.out.println("점심시간입니다.");
		}
	}

}
