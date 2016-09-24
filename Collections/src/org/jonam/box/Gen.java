package org.jonam.box;

public class Gen<T, V> {
	T ob1;
	V ob2;
	Gen(T o1, V o2)
	{
		ob1 = o1;
		ob2 = o2;
	}
	void showTypes()
	{
		System.out.println("Type of T is: " + ob1.getClass().getName());
		System.out.println("Type of V is: " +ob2.getClass().getName());
	}
	T getob1()
	{
		return ob1;
	}
	V getob2()
	{
		return ob2;
	}

}
