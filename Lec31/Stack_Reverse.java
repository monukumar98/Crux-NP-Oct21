package Lec31;

import java.util.Stack;

public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		System.out.println("......................");
		Reverse(st);
		System.out.println(st);

	}

	public static void Reverse(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}

		int item = st.pop();
		Reverse(st);
		InsertDown(st,item);

	}

	private static void InsertDown(Stack<Integer> st, int item) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		
		int ii = st.pop();
		InsertDown(st, item);
		st.push(ii);
		
	}

}
