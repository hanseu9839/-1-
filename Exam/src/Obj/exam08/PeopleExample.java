package Obj.exam08;

public class PeopleExample {

	public static void main(String[] args) {
		People j = new JobPeople("����¦","1234",24,"1");
		People s = new Student("�ѵյ�","2345","234");
		
		System.out.println(j.toString());
		j.eat();
		System.out.println(s.toString());
		s.eat();
		
	}

}
