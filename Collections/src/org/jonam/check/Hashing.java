package org.jonam.check;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userinput = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		Map<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
		int index =0;
		while(index<5)
		{
			index++;
			System.out.println("Please enter next string: ");
			list.add(userinput.nextLine());
			map.put(index, (ArrayList<String>) list);
		}
		System.out.println(map);
		userinput.close();
		

	}

}
