package Practice;

/*
 * create the class as final
 * declare the variables as private and final
 * there will only be getters
 * there will be a parameterized constructor
 * */

public final class PracticeImmutableClass {

	//Class has Employee details
	private final String name;
	private final int age;
	private final int salary;
	private final String address;
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public String getAddress() {
		return address;
	}

	public PracticeImmutableClass(int salary, int age, String address, String name) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
		
		// TODO Auto-generated constructor stub
	}

	

}
