package org.jonam.copy;
import java.util.ArrayList;
public class DuplicateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(9);
		list1.add(6);
		list1.add(7);
		System.out.println("The list 1 is: ");
		System.out.println(list1);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(list1);
		System.out.println("The list 2 after copying is: " +list2);

	}

}
