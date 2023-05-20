package Practice;

public final class PracticeImmutable {
	private final String name;
	private final String address;
	private final int age;
	
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	
	public PracticeImmutable(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	
	
	void test() {
		//PracticeImmutable pm = new PracticeImmutable();
	}	
	
	}
