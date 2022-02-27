package Lec30;

public class Student {
	String name;
	int age;

	public Student() {
		// TODO Auto-generated constructor stub
		this.name = "Rohan";
		this.age = 23;

	}

	@Override
	public String toString() {
		return this.name + " and " + this.age;
	}
	

}
