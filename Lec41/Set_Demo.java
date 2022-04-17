package Lec41;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(101);
		set.add(11);
		set.add(91);
		set.add(9891);
		set.add(-190);
		set.add(91);
		System.out.println(set);
//		System.out.println(set.remove(91));
//		System.out.println(set);
//		System.out.println(set.contains(90));
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(101);
		set1.add(11);
		set1.add(91);
		set1.add(9891);
		set1.add(-190);
		set1.add(91);
		System.out.println(set1);
//		System.out.println(set1.remove(91));
//		System.out.println(set1);
		
		LinkedHashSet<Integer> set2= new LinkedHashSet<>();
		
		set2.add(101);
		set2.add(11);
		set2.add(91);
		set2.add(9891);
		set2.add(-190);
		set2.add(91);
		System.out.println(set2);
		//System.out.println(set2.remove(91));
	///	System.out.println(set2);
		

	}

}
