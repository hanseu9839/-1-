package Obj.exam09;

public class KumhoTire extends Tire{
	
	KumhoTire(String location,int maxRotation){
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"KumhoTire ���� :"+(maxRotation-accumulatedRotation)+"ȸ�Դϴ�.");
			return true;
		}else {
			System.out.println("Ÿ�̾ ��ũ�����ϴ�.");
			return false;
		}
	}
	
}
