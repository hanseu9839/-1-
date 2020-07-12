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
		System.out.println("사내식당에서 밥을 먹습니다.");
	}
	@Override
	public String toString() {
		return "JobPeople [JobNo=" + JobNo + ", name=" + name + ", age=" + age + ", ssn=" + ssn + ", tel=" + tel + "]";
	}

	
}
