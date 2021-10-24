package Lec2;

public class Ques_Pre_Post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b=a++;
		int c=--b;
		int x=90;
		x= x + --b + c++ + a++ + b++;
		System.out.println(x);

	}

}
