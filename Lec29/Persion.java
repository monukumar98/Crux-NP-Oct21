package Lec29;

public class Persion {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
			if (age < 0) {

				throw new Exception("pgl hai -ve age nhi hota h");
			}

			this.age = age;
		}

		catch (Exception c) {
			System.out.println("Catch");
			c.printStackTrace();
		} finally {
			System.out.println("Hey bro i am here");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
