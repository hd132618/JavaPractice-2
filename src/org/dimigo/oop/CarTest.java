/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_CarTest
 * 개요 : 
 * 작성일 : 2015. 4. 13.
 * @author	gandd_000
 * @version	1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car3 car1 = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car3 car2 = new Car3("기아자동차", "K7", "흰색", 246);
		Car3 car3 = new Car3("삼성자동차", "SM7", "회색");
		
//		car1.setCompany("현대자동차");
//		car1.setModel("제네시스");
//		car1.setColor("검정색");
//		car1.setMaxSpeed(225);
//		car1.setPrice(50000000);
//		
//		car2.setCompany("기아자동차");
//		car2.setModel("K7");
//		car2.setColor("흰색");
//		car2.setMaxSpeed(246);
//		car2.setPrice(40000000);
//		
//		car3.setCompany("삼성자동차");
//		car3.setModel("SM7");
//		car3.setColor("회색");
//		car3.setMaxSpeed(200);
//		car3.setPrice(38000000);
		
		
//		System.out.println("<< 자동차 목록 >>"); 
//		System.out.println("제조사명 : " + car1.getCompany());
//		System.out.println("모델명 : " +  car1.getModel());
//		System.out.println("색상 : " + car1.getColor());
//		System.out.println("최대속도 : " + car1.getMaxSpped() + "km");
//		System.out.println("가격 : " + String.format("%,d", car1.getPrice()) + "원");
//		System.out.println();
//		System.out.println("제조사명 : " + car2.getCompany());
//		System.out.println("모델명 : " +  car2.getModel());
//		System.out.println("색상 : " + car2.getColor());
//		System.out.println("최대속도 : " + car2.getMaxSpped() + "km");
//		System.out.println("가격 : " + String.format("%,d", car2.getPrice()) + "원");
//		System.out.println();
//		System.out.println("제조사명 : " + car3.getCompany());
//		System.out.println("모델명 : " +  car3.getModel());
//		System.out.println("색상 : " + car3.getColor());
//		System.out.println("최대속도 : " + car3.getMaxSpped() + "km");
//		System.out.println("가격 : " + String.format("%,d", car3.getPrice()) + "원");

		car1.printCar();
		car2.printCar();
		car3.printCar();
	}
}
