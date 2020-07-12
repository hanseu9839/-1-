package Inter;

public class A {
	A(){ System.out.println("A狼 按眉啊 积己凳");}
	class B{
		B(){ System.out.println("B狼 按眉啊 积己凳");}
		int field1;
		//static int field2;
		public void method1() {}
		//public static void method2(){}
	}
	
	static class C{
		C(){ System.out.println("C按眉啊 积己凳");}
		int field1;
		static int field2;
		public void method1() {}
		public static void method2() {}	
	}
	void methodD() {
		class D{
		 D() {System.out.println("D按眉啊 积己凳");}
		 int field1;
		 //static int field2;
		 void method1() {}
		 //static void method2(){}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
