package org.jonam.sub;
import java.util.HashSet;
import java.util.Set;
public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> list1 = new HashSet<Integer>();
		Set<Integer> list2 = new HashSet<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		Set<Integer> finallist = new HashSet<Integer>();
		for(Integer i:list1)
		{
			if(!list2.contains(i))
			{
				finallist.add(i);
			}
		}
		for(Integer i:list2)
		{
			if(!list1.contains(i))
			{
				finallist.add(i);
			}
		}
		for(Integer i:list2)
		{
			if(list1.contains(i))
			{
				finallist.add(i);
			}
		}
		System.out.println(finallist);

	}

}
