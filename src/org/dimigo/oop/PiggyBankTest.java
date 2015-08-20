/**
 * 
 */
package org.dimigo.oop;

/**
 * org.dimigo.oop
 * └PiggyBankTest
 *
 * @author	: gandd_000
 * @date	: 2015. 6. 15.
 * @version	: 1.0
 */
public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember one = new FamilyMember("아빠");
		FamilyMember two = new FamilyMember("엄마");
		FamilyMember three = new FamilyMember("나");
		FamilyMember four = new FamilyMember("남동생");
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(one, 10000);
		PiggyBank.putMoney(two, 5000);
		PiggyBank.putMoney(three, 2000);
		PiggyBank.putMoney(four, 1000);
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(three, 1000);
		
		PiggyBank.printBalance();
		
	}

}
