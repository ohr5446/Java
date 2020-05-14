/*
	
	Date : 2020.05.14
	Author : HyeongRok
	Description : whileEx
	Version : 1.4

*/


package Java0514;

import java.util.Scanner;

public class Ex01_WhileEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int account = 0;
		boolean run = true;
		int menu;

		while (run) {

			System.out.println("-----------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택 >> ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.print("예금액 >> ");
				account += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액 >> ");
				account -= sc.nextInt();
				break;
			case 3:
				System.out.print("잔고 >> " + account);
				break;
			case 4:
				System.out.println("종료 >> ");
				
				run = false;
				break;
			default:
				System.out.println("그 외에 숫자를 입력했습니다.");
				break;
			}
			System.out.println();

		}
		System.out.println("프로그램을 종료합니다.");

	}

}
