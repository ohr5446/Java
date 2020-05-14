/*
	
	Date : 2020.05.12
	Author : HyeongRok
	Description : switchCaseExample1
	Version : 1.2

*/

package Java0512;

import java.util.Scanner;

public class ex05_switchCase2 {

	public static void main(String[] args) {
		// switch-case문 사용해서
		// 월별 날짜 계산하기
		
		int month;
		int day = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요 >> ");
		month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default : 
			System.out.println("값을 잘못 입력했습니다.");
			break;
		
			
		}
		if (month >= 1 && month <= 12) 
			System.out.println("입력하신 " + month + "월은 " + day + "일 까지입니다.");
		
		
		
		
		
		
		
		
		

	}

}
