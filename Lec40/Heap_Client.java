package Lec40;

public class Heap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap hp = new Heap();
		hp.add(2);
		hp.add(3);
		hp.add(1);
		hp.add(5);
		hp.add(7);
		hp.add(11);
		hp.add(9);
		hp.add(13);
		hp.add(-7);
		hp.add(-3);
		hp.display();
		System.out.println(hp.Remove());
		System.out.println(hp.Remove());
		hp.display();

	}

}
