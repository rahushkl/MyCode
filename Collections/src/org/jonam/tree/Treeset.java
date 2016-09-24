package org.jonam.tree;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Hyundai", 50000);
		Car car2 = new Car("Toyota", 45000);
		if(car1.compareTo(car2)<0)
		{
			System.out.println(car1.getModel()+" is better.");
		}
		else if(car1.compareTo(car2)>0)
		{
			System.out.println(car2.getModel()+" is better.");
		}
		else
		{
			System.out.println("Both are same.");
		}

	}

}
