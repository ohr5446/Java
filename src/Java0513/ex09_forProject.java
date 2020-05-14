/*
	
	Date : 2020.05.13
	Author : HyeongRok
	Description : 별찍기 조별과제
	Version : 1.3

*/

package Java0513;

public class ex09_forProject {

	public static void main(String[] args) {
		// *
		// ***
		// *****
		// *******

		// i = 1씩 증가 * = i만큼 증가
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}
}