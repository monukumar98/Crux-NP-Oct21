package Lec29;

public class Student_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.SetName("Rahul");
		System.out.println("hey");
		s.SetAge(-78);
		System.out.println(s.GetAge());
		System.out.println(s.GetName());

	}

}
