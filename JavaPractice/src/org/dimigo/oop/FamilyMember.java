/**
 * 
 */
package org.dimigo.oop;

/**
 * org.dimigo.oop
 * └FamilyMember
 *
 * @author	: gandd_000
 * @date	: 2015. 6. 15.
 * @version	: 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember()
	{
		
	}
	
	public FamilyMember(String memberName)
	{
		this.memberName = memberName;
		memberCnt++;
	}
	
	public String getMemberName() {
		return memberName;
	}

	public static void printMemberCnt()
	{
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}
}
