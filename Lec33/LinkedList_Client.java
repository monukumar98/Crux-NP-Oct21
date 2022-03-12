package Lec33;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addfirst(1);
		ll.addfirst(2);
		ll.addfirst(3);
		// ll.Display();
		ll.addlast(6);
		ll.addlast(5);
		// ll.Display();
		ll.Addatindex(2, 90);
		ll.Display();
//		System.out.println(ll.getfirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.getatindex(3));

		//System.out.println(ll.removefirst());
		//System.out.println(ll.removeLast());
		System.out.println(ll.removekthnode(2));
		ll.Display();

	}

}
