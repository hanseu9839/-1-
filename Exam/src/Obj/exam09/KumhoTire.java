package Obj.exam09;

public class KumhoTire extends Tire{
	
	KumhoTire(String location,int maxRotation){
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"KumhoTire 수명 :"+(maxRotation-accumulatedRotation)+"회입니다.");
			return true;
		}else {
			System.out.println("타이어가 펑크났습니다.");
			return false;
		}
	}
	
}
