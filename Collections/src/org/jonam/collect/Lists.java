package org.jonam.collect;
import java.util.ArrayList;
public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(-8);
		list.add(11);
		int max = list.get(0);
		for(Integer i: list)
		{
			if(i>max)
			{
				max = i;
			}
		}
		System.out.println("The maximum value is: "+max);

	}

}
