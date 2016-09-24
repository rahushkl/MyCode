package org.jonam.comparator;

import java.util.Comparator;

public class Car {
	String Model;
	int cost;
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Car(int cost, String model)
	{
		this.cost = cost;
		this.Model = model;
	}
	

}
class SizeComparator implements Comparator<Car> {
	@Override
	public int compare(Car car1, Car car2) {
		int car1cost = car1.getCost();
		int car2cost = car2.getCost();
 
		if (car1cost > car2cost) {
			return 1;
		} else if (car1cost < car2cost) {
			return -1;
		} else {
			return 0;
		}
	}
}
