package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int value : arr) {
			for (int i = 0; i < 10; i++) {
				if (i == value-1)
					System.out.print("*");
				else

					System.out.print(i);
			}
			System.out.println();
		}
	}

}
