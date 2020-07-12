package Obj.exam08;

public class Student extends People{
	String studentNo;
	
	Student(String name,String ssn,String studentNo){
		super(name,ssn);
		this.studentNo=studentNo;
	}

	@Override
	public void eat() {
		System.out.println("학교급식시간입니다.");
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", age=" + age + ", ssn=" + ssn + ", tel=" + tel
				+ "]";
	}
	
}
