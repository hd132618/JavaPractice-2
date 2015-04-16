/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_Car
 * 개요 : 
 * 작성일 : 2015. 4. 13.
 * @author	gandd_000
 * @version	1.0
 */
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	
	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpped() {
		return maxSpeed;
	}

	public int getPrice() {
		return price;
	}

	public void setCompany(String newCompany) {
		company = newCompany;
	}

	public void setModel(String newModel) {
		model = newModel;
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	public void setMaxSpeed(int newMaxSpeed) {
		maxSpeed = newMaxSpeed;
	}

	public void setPrice(int newPrice) {
		price = newPrice;
	}

}
