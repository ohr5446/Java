/*
	
	Date : 2020.05.13
	Author : HyeongRok
	Description : reverseStar
	Version : 1.3

*/

package Java0513;

public class ex07_reverseStar {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}

			System.out.println();

		}

	}

}
