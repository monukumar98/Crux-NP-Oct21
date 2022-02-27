package Lec30;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		P obj = new P();
//		System.out.println(obj.d);//10
//		System.out.println(obj.d1);//100
//		obj.fun();
//		obj.fun1();

//		P obj = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(((C)(obj)).d2);
//		System.out.println(((C)(obj)).d);
//		obj.fun();
//		obj.fun1();
//		((C) obj).fun2();

//		C obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);

		C obj = new C();
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(obj.d);
		System.out.println(((P)obj).d);
		obj.fun();
		obj.fun1();
		obj.fun2();

	}

}
