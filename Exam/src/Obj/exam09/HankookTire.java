package Obj.exam09;

public class HankookTire extends Tire{
	
	HankookTire(String location,int maxRotation){
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+" HankookTire 수명 :"+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("타이어가 펑크 났습니다.");
			return false;
		}
		
	}
	
	

}
