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
public class Car2 {
	public String company;
	public String model;
	public String color;
	public int maxSpeed;
	public int price;

	public Car2() {

	}

	public Car2(String company, String model, String color, int maxSpeed, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}

	public Car2(String company, String model, String color, int maxSpeed) {
		this(company, model, color, maxSpeed, 0);
	}

	public Car2(String company, String model, String color) {
		this(company, model, color, 0);
	}
	// public String getCompany() {
	// return company;
	// }
	//
	// public String getModel() {
	// return model;
	// }
	//
	// public String getColor() {
	// return color;
	// }
	//
	// public int getMaxSpped() {
	// return maxSpeed;
	// }
	//
	// public int getPrice() {
	// return price;
	// }
	//
	// public void setCompany(String newCompany) {
	// company = newCompany;
	// }
	//
	// public void setModel(String newModel) {
	// model = newModel;
	// }
	//
	// public void setColor(String newColor) {
	// color = newColor;
	// }
	//
	// public void setMaxSpeed(int newMaxSpeed) {
	// maxSpeed = newMaxSpeed;
	// }
	//
	// public void setPrice(int newPrice) {
	// price = newPrice;
	// }

}
