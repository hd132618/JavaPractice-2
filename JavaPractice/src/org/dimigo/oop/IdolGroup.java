/**
 * 
 */
package org.dimigo.oop;

/**
 * org.dimigo.oop
 * └IdolGroup
 *
 * @author	: gandd_000
 * @date	: 2015. 5. 28.
 * @version	: 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
		
		String[][] members = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "혜리", "소진", "민아"}
		};
		
		for(int i=0; i <idolGroup.length; i++)
		{
			System.out.println("<< " + idolGroup[i] + " 멤버 >>");
			for(int j=0; j <members[i].length; j++)
			{
				System.out.println(members[i][j]);
			}
			System.out.println();
		}
		
	}
}
