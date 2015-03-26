package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		String vehicleType;
		int distance;
		int cost;

		vehicleType = "고속버스";
		distance = 21;

		switch (vehicleType) {
		case "고속버스":
			cost = 850;
			if (distance > 10) {
				cost += ((distance - 1) / 10) * 300;
			}
			break;
		case "경차":
			cost = 300;
			if (distance > 10) {
				cost += ((distance - 1) / 10) * 200;
			}
			break;
		case "그 외":
			cost = 600;
			if (distance > 10) {
				cost += ((distance - 1) / 10) * 200;
			}
			break;
		default:
			cost = 0;
			System.out.println("?");
			break;

		}

		System.out.println("<< 고속버스 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + vehicleType);
		System.out.println("통행료 : " + cost + "원");
	}

}
