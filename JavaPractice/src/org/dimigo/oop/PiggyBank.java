/**
 * 
 */
package org.dimigo.oop;

/**
 * org.dimigo.oop
 * └PiggyBank
 *
 * @author	: gandd_000
 * @date	: 2015. 6. 15.
 * @version	: 1.0
 */
public class PiggyBank {
	private static int balance;
	
	public PiggyBank()
	{
		
	}
	
	public static void putMoney(FamilyMember member, int amount)
	{
		System.out.println(member.getMemberName() + " " + amount +"원 넣음");
		balance += amount;
	}
	public static void printBalance()
	{
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
	}
}
