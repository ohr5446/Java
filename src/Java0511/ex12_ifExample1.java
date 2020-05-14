/*
	
	Date : 2020.05.11
	Author : HyeongRok
	Description : 조건문연습문제(ifExample1)
	Version : 1.1

*/

package Java0511;

import java.util.Scanner;

public class ex12_ifExample1 {

	public static void main(String[] args) {
		// 문제. 성적출력 예제
		// 점수를 입력받아서
		// 90점 이상이면 "A학점 입니다" 출력
		// A : 90~100
		// B : 80~89
		// C : 70~79
		// D : 60~69
		// F : 60미만
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.println("점수를 입력하세요.(최대점수는 100점입니다)");
		score = sc.nextInt();
		
		if(score > 100) {
			System.out.println("최대점수를 초과하였습니다.");
		} else if(score >= 90) {
			System.out.println("A학점 입니다.");
		} else if(score >= 80) {
			System.out.println("B학점 입니다.");
		} else if(score >= 70) {
			System.out.println("C학점 입니다.");
		} else if(score >= 60) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}
		

	}

}
