package Obj.exam05;

public class Calculator {
	int plus(int x,int y) {
		int result = x+y;
		return result;
	}
	
	double avg(int x,int y) {
		double result= plus(x,y);
		return result;
	}
	
	void execute() {
		double result=avg(7,10);
		println("실행 결과 :"+result);
	}
	void println(String message) {
		System.out.println(message);
	}
}
