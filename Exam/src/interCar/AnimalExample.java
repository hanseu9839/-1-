package interCar;

public class AnimalExample {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Animal cat = new Cat(24,"�ǳ���");
		Animal dol = new Dolpin("����",25);
		
		zoo.eat(cat);
		zoo.eat(dol);
		
		zoo.sleep(cat);
		zoo.sleep(dol);
		
		dol.breath();
		if(dol instanceof Dolpin) {
		Dolpin d=(Dolpin)dol;
		//dol.dance;
		d.dance();
		}
		if(cat instanceof Cat) {
		Cat c = (Cat)cat;
		c.shake();
		//cat.shake();
		}

	}

}
