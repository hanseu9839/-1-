package Obj.exam09;

public class HankookTire extends Tire{
	
	HankookTire(String location,int maxRotation){
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+" HankookTire ���� :"+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("Ÿ�̾ ��ũ �����ϴ�.");
			return false;
		}
		
	}
	
	

}
