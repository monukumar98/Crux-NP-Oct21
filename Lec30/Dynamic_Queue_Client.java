package Lec30;

public class Dynamic_Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynaicQueue dq = new DynaicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Enqueue(50);
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Display();

	}

}
