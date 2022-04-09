package Lec39;

public interface StackI {
	int v = 90;

	public void push(int item);

	public int fun();

	static void fun1() {

	}

	 default void fun2() {
		// v=9;
	}

	private void fun3() {

	}
}
