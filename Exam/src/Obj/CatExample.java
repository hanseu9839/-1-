package Obj;

public class CatExample {
	public static void main(String[] args) {
		Animal cat = new Animal("뽀냥이",24);
		System.out.println(cat.Variable);
		System.out.println(cat.name);
		System.out.println(cat.age);
		Animal dog = new Animal("강아지","둥아지",25);
		System.out.println(dog.Variable);	
		System.out.println(dog.age);
		System.out.println(dog.name);
		
		Animal no =new Animal("이름없음");
		System.out.println(no.Variable);
		System.out.println(no.name);
		System.out.println(no.age);
	}
}
