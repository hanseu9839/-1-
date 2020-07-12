package Obj.animal;

public class AnimalExample {

	public static void main(String[] args) {
		Animal cat= new Cat();
		Animal dog= new Dog();
		cat.sound();
		dog.sound();
		System.out.println("-------------------");
		
		Animal animal =null;
		
		animalSound(new Cat());
		animalSound(new Dog());

	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
