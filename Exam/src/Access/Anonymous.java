package Access;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("����� �մϴ�.");
		}
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	
	void method1() {
		Person locarVar = new Person() {
			void walk() {
				System.out.println("��å�� �մϴ�.");
			}
			
			@Override
			void wake() {
				System.out.println("��ħ 7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		locarVar.wake();
	}
	void method2(Person person) {
		person.wake();
	}
}
