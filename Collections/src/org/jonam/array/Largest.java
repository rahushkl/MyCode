package org.jonam.array;
import java.util.ArrayList;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		int max = list.get(0);
		for (int index : list) {
	        if (index > max) {
	            max = index;
	        }
	    }
		System.out.println("The largest integer is: "+max);

	}

}
