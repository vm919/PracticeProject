package Practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeConstructorOverloading {

	String name;
	String address;
	int age;
	int salary;

	public PracticeConstructorOverloading() {
		// TODO Auto-generated constructor stub
	}

	public PracticeConstructorOverloading(String name) {
		this.name = name;
	}

	public PracticeConstructorOverloading(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public PracticeConstructorOverloading(String name, String address, int age) {

	}

	public PracticeConstructorOverloading(String name, String address, int age, int salary) {

	}

	public static void main(String[] args) {
		PracticeConstructorOverloading pco = new PracticeConstructorOverloading();
		PracticeConstructorOverloading pOne = new PracticeConstructorOverloading("Vaibhav", "USA");
		List<Student> list = new ArrayList();
		
		Student s1 =  new Student("Raj", "Civil", "Pune"); 
		Student s2 =  new Student("Rajat", "CS", "Banglore"); 
		Student s3 =  new Student("Sanjay", "Electrical", "Pune"); 
		Student s4 =  new Student("Mohit", "Civil", "Delhi"); 
		
		//adding elements to list in one way
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		//adding elements to list in another way
		list.add(new Student("Raj", "Civil", "Pune"));
		
		
		pco.setName("Vaibhav");
		System.out.println("The name is: " + pco.getName());
	
		System.out.println("The name is: " + pOne.getName() +" "+ "The address is: " + pOne.getAddress());

	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

class Student {
	String name;
	String course;
	String section;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	public Student(String name, String course, String section) {
		super();
		this.name = name;
		this.course = course;
		this.section = section;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", section=" + section + "]";
	}
	
	
}
