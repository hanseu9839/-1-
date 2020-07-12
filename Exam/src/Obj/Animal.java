package Obj;

public class Animal {
	String Variable = "°í¾çÀÌ";
	String name;
	int age;
	Animal(String name,int age){
		this.name=name;
		this.age = age;
	}
	Animal(String Variable,String name,int age){
		this.Variable=Variable;
		this.name=name;
		this.age=age;
	}
	Animal(String name){
		this.name=name;
	}
}
