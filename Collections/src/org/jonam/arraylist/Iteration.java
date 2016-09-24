package org.jonam.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		@SuppressWarnings("rawtypes")
		ListIterator lt = list.listIterator();
		System.out.println("Forward Iteration: ");
		while(lt.hasNext())
			System.out.println(lt.next());
		System.out.println("Backward Iteration: ");
		while(lt.hasPrevious())
			System.out.println(lt.previous());
		System.out.println("Previous index is: "+lt.previousIndex());
		System.out.println("Next Index is: "+lt.nextIndex());
		System.out.println("Next value is: "+lt.next());
		
		System.out.println("Previous index is: "+lt.previousIndex());
		System.out.println("Next Index is: "+lt.nextIndex());
		System.out.println("Next value is: "+lt.next());
		lt.remove();
		System.out.println("Next Index is: "+lt.nextIndex());
		System.out.println("Next value is: "+lt.next());

	}

}
