package PracticeQuestions;

public class NullPointerExceptionTest {

	public NullPointerExceptionTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String str = "";
		String strOne = null;	
		System.out.println(str);
	//	System.out.println(strOne.length());
		
		Student s = new Student();
		String name = s.getName();
		System.out.println(name);
		
		getStudentDetails();
	}

	public static Student getStudentDetails() {
		Student stu = null;
		System.out.println(stu.getAge());
		return stu;
	}
}

class Student{
	public Student() {
		super();
	}
	
	public Student(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}
	
	private String name;
	private String city;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}