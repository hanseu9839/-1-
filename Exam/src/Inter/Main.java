package Inter;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		A.C c =new A.C();
		c.field1 = 3;
		c.method1();
		c.field2 = 5;
		c.method2();
		
		a.methodD();

	}

}
