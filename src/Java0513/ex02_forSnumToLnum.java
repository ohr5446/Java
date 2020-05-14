/*
	
	Date : 2020.05.13
	Author : HyeongRok
	Description : S부터 L까지 합 구하기
	Version : 1.4

*/

package Java0513;

import java.util.Scanner;

public class ex02_forSnumToLnum {
	
	public static void main(String[] args) {
		// for문 사용해서
		// 두개의 정수(시작값, 끝나는 값)를 입력받아서
		// 총합을 구하는 프로그램 만들어 보시오.
		
		Scanner sc = new Scanner(System.in);
		
		int sNum;
		int lNum;
		int sum = 0;
		
		System.out.println("시작값을 입력해 주세요.");
		sNum = sc.nextInt();
		
		System.out.println("끝나는값을 입력해 주세요");
		lNum = sc.nextInt();
		
		
		for(int i = sNum; i <= lNum; i++) {
			sum += i;
			System.out.print(i);
			if (i < lNum) {
				System.out.print("+");
			} else {
				System.out.println("=" + sum);
			}
		}
		
		
		
		System.out.println(sNum+"부터"+lNum+"까지의 총합은 : " + sum);
		
		
		
	}

}
