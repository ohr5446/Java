/*
	
	Date : 2020.05.12
	Author : HyeongRok
	Description : ifExample2
	Version : 1.2

*/

package Java0512;

import java.util.Scanner;

public class ex01_ifExample2 {

	public static void main(String[] args) {
		// 스캐너를 사용해서 국어, 영어, 수학점수를
		// 입력받아서 총점, 평균을 구하시오.
		// 평균점수를 이용하여
		// A+, A, B+, B, C+, C, D+, D, F
		// 프로그램을 만들어보시오!
		// 총점과 평균은 실수형으로
		
		Scanner sc = new Scanner(System.in);
		
		int kor;
		int eng;
		int mat;
		double result;
		String grade;
		
		System.out.println("국어점수를 입력하시오.");
		kor = sc.nextInt();
		
		System.out.println("영어점수를 입력하시오.");
		eng = sc.nextInt();
		
		System.out.println("수학점수를 입력하시오.");
		mat = sc.nextInt();
		
		result = kor + eng + mat;
		System.out.println("총점은 : " + result + " 입니다.");
		result = result / 3;
		System.out.println("평균은 : " + result + " 입니다.");
		
		if(result <= 100) {
			if(result >= 90) {
				if(result >= 95) {
					grade = "A+";
				} else {
					grade = "A";
				}
			} else if(result >= 80) {
				if(result >= 85) {
					grade = "B+";
				} else {
					grade = "B";
				}
			} else if(result >= 70) {
				if(result >= 75) {
					grade = "C+";
				} else {
					grade = "C";
				}
			} else if(result >= 60) {
				if(result >= 65) {
					grade = "D+";
				} else {
					grade = "D";
				}
			} else {
				grade = "F";
			}
			System.out.println("당신의 학점은 : " + grade + " 입니다.");
		} else {
			System.out.println("입력범위를 초과하였습니다.");
		}
		
		
		

	}

}
