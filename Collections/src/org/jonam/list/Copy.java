package org.jonam.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		System.out.println("The list 1 is: "+list1);
		System.out.println("The list 2 is: "+list2);
		System.out.println("After adding list 1 to list 2:");
		Collections.copy(list2,list1);
		System.out.println("The list 2 is: "+list2);

	}

}
