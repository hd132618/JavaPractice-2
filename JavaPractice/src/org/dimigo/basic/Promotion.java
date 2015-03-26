package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int pay = 1700000, worker = 3, store = 1500;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", pay));
		System.out.println("점포 내 직원 수 : " + worker );
		System.out.println("점포 수 : " + String.format("%,d", store));
		
		long yearpay = pay * 12L * worker * store;
		System.out.println("연간 인건비 : " + String.format("%,d", yearpay));
	}

}
