package org.jonam.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(50000, "Hyundai");
		Car car2 = new Car(45000, "Honda");
		Car car3 = new Car(60000, "Audi");
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		Collections.sort(cars, new SizeComparator());
		for (Car index : cars) {
			System.out.println(index.getModel()+" has cost "+index.getCost());
		}

	}

}
