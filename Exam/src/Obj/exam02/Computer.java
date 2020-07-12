package Obj.exam02;

public class Computer {
	public int plus1(int [] values) {
		int result=0;
		for(int i=0;i<values.length;i++) {
			result+=values[i];
		}
		return result;
	}
	public int plus2(int ... values) {
		int result=0;
		for(int i=0;i<values.length;i++) {
			result+=values[i];
		}
		return result;
	}
}
