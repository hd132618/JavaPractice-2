package org.dimigo.oop;
import java.util.Scanner;

/**
 * 
 */

/**
 * <pre>
 * 
 * |_Score
 * 개요 : 
 * 작성일 : 2015. 5. 14.
 * @author	gandd_000
 * @version	1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int mat = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		StringBuilder sb = new StringBuilder();
		sb.append("<< 점수 출력 >>\n").append("국어 점수 : ").append(kor).append("점\n").append("수학 점수 : ").append(mat).append("점\n").append("영어 점수 : ").append(eng).append("점\n").append("총점 : ").append(kor+mat+eng).append("점\n").append("총점 : ").append(String.format("%.1f", (kor+mat+eng)/3.0)).append("점\n");
		System.out.println(sb);
		scanner.close();

	}

}
