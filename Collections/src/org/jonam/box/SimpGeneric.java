package org.jonam.box;

public class SimpGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Integer, String> obj = new Gen<Integer, String>(12,"Awesome");
		obj.showTypes();
		int value = obj.getob1();
		System.out.println("The value is: "+value);
		String str = obj.getob2();
		System.out.println("The value is: "+str);

	}

}
