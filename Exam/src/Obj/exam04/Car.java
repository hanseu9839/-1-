package Obj.exam04;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}else {
		System.out.println("gas가 있습니다.");
		return true;
		}
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("차가 달립니다.(가스의 잔량은 "+gas+")");
				gas--;
			}else {
				System.out.println("차가 멈춥니다.");
				return;
			}
		}
	}
}
