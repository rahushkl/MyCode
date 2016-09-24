package org.jonam.tree;

public class Car implements Comparable<Car>{
	String model;
	int cost;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	Car(String model, int cost)
	{
		this.model = model;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Car car) {
		if(this.cost>car.cost)
		{
			return 1;
		}
		else if(this.cost<car.cost)
		{
			return -1;
		}
		else
		{
		return 0;
		}
	}
	

}
