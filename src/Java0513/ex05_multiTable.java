/*
	
	Date : 2020.05.13
	Author : HyeongRok
	Description : 구구단
	Version : 1.3

*/

package Java0513;

public class ex05_multiTable {

	public static void main(String[] args) {
		// 중첩for문을 이용하여
		// 구구단을 작성
		// 2단부터 9단까지

		int xxx;
//
//		for (int i = 1; i <= 9; i++) {
//
//			for (int j = 2; j <= 9; j++) {
//				xxx = i * j;
//
//				System.out.print(j + "X" + i + "=" + xxx);
//				System.out.print("\t");
//			}
//			System.out.println();
//		}

		// 응용문제.
		// 홀수단 만 출력하기!

		

		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {
				if(j%2 == 0) {
					continue;
				}
				xxx = i * j;
				System.out.print(j + "X" + i + "=" + xxx);
				System.out.print("\t");
			}
			System.out.println();
		}

	}
}
