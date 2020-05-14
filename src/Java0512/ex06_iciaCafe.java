/*
	
	Date : 2020.05.12
	Author : HyeongRok
	Description : iciaCafe
	Version : 1.2

*/

package Java0512;

import java.util.Scanner;

public class ex06_iciaCafe {

	public static void main(String[] args) {
		// 키오스크 : 무인결제 시스템
		
		// 아메리카노(4,000원)
		// 바닐라라떼(4,500원)
		// 민트초코프라페(6,000원)
		// 얼그레이블랙티(5,000원)
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int price = 0;
		String menu = "";
		
		System.out.println("ICIA Cafe에 오신 것을 환영합니다.");
		System.out.println("주문을 도와드리겠습니다.\n");
		// \n 의미 = 줄바꿈
		// \t 의미 = tap키와 같은역할
		System.out.println("1. 아메리카노\t\t2.바닐라라떼");
		System.out.println("3.민트초코프라페\t\t4.얼그레이블랙티\n");
		
		System.out.println("메뉴를 선택해 주세요");
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			menu = "아메리카노";
			price = 4000;
			break;
		case 2:
			menu = "바닐라라떼";
			price = 4500;
			break;
		case 3:
			menu = "민트초코프라페";
			price = 6000;
			break;
		case 4:
			menu = "얼그레이블랙티";
			price = 5000;
			break;
		default:
			System.out.println("해당 메뉴는 없습니다!");
		}
		if(num >= 1 && num <= 4) {
			System.out.println("\n주문하신 메뉴는 " + menu);
			System.out.println("가격은 " + price + "원 입니다.");
		}
		System.out.println("이용해 주셔서 감사합니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
