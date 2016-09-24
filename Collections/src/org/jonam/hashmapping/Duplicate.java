package org.jonam.hashmapping;

import java.util.HashMap;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(20, "Banana");
		hm.put(40, "Apple");
		hm.put(50, "Guava");
		System.out.println("before the duplication: ");
		System.out.println(hm);
		hm.put(20,"Peach");
		System.out.println("After Duplication:");
		System.out.println(hm);

	}

}
