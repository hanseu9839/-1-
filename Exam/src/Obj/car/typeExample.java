package Obj.car;

public class typeExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		if(parent instanceof Child) {
			System.out.println("자식객체가 부모의 객체로 자동형변환 되어있습니다.");
		}else {
			System.out.println("객체참조오류");
		}

	}

}
