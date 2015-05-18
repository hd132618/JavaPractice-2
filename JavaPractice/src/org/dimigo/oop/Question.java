/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * |_Question
 * 개요 : 
 * 작성일 : 2015. 5. 14.
 * @author	gandd_000
 * @version	1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("가장 좋아하는 가수는?");
		String answer1 = scanner.nextLine();

		if (answer1.equals("빅뱅")) {
			System.out.println("정답입니다");
		} else {
			System.out.println("틀렸습니다");
		}

		System.out.println("가장 좋아하는 배우는?");
		String answer2 = scanner.nextLine();

		if (answer2.equals("조인성")) {
			System.out.println("정답입니다");
		} else {
			System.out.println("틀렸습니다");
		}

		System.out.println("가장 좋아하는 과목은?");
		String answer3 = scanner.nextLine();

		if (answer3.equals("자바")) {
			System.out.println("정답입니다");
		} else {
			System.out.println("틀렸습니다");
		}
		scanner.close();
	}
}
