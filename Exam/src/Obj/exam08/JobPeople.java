package Obj.exam08;

public class JobPeople extends People {
	String JobNo;
	JobPeople(String name,String ssn,int age,String JobNo){
		super(name,ssn);
		this.age=age;
		this.JobNo=JobNo;
		
	}
	@Override
	public void eat() {
		System.out.println("�系�Ĵ翡�� ���� �Խ��ϴ�.");
	}
	@Override
	public String toString() {
		return "JobPeople [JobNo=" + JobNo + ", name=" + name + ", age=" + age + ", ssn=" + ssn + ", tel=" + tel + "]";
	}

	
}
