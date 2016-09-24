package org.jonam.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(9);
		list.add(8);
		list.add(7);
		System.out.println("Before sorting the list is: ");
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("After the sorting: ");
		System.out.println(list);

	}

}
