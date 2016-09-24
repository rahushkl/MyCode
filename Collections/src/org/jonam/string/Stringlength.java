package org.jonam.string;
import java.util.ArrayList;
public class Stringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<String>();
		str.add("rahul");
		str.add("shukla");
		str.add("addition");
		str.add("jonam");
		 String longestString = str.get(0);
		    for (String index : str) {
		        if (index.length() > longestString.length()) {
		            longestString = index;
		        }
		    }
		    System.out.println("The max length is "+longestString.length());
		    System.out.println("Of the string: "+longestString);

	}

}
