package Lec29;
public class Student {
	private String name;
	private int age;

	public void SetName(String name) {
		this.name = name;
	}

	public void SetAge(int age) throws  Exception{
		if (age < 0) {
			throw new Exception("Eneter a Valid Age");
		}
		this.age = age;
	}

	public int GetAge()  {
		
		return this.age;
	}

	public String GetName() {
		return this.name;
	}

}
