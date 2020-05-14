/*
	
	Date : 2020.05.08
	Author : HyeongRok
	Description : Java 기본설정
	Version : 1.0

*/

package Java0508;

public class ex02_char {

	public static void main(String[] args) {
		// 문자형 변수타입 char(2byte)
		char ch1;
		ch1 = 'A'; //65
		
		//A를 출력하기위한 문법
		System.out.println("A");
		System.out.println(ch1);
		System.out.println((int)ch1);
		// 문자를 숫자형으로 바꿀때 변수명 앞에 (int)
		
		char ch2 = 'B'; //66
		System.out.println((int)ch2);
		
		char ch3 = 'a'; //97
		char ch4 = 'b'; //98
		System.out.println((int)ch3);
		System.out.println((int)ch4);
		
		int num1 = 65;
		System.out.println((char)num1);
		// 숫자를 문자형으로 바꿀때 변수명 앞에 (char)
		
		char ohr = '오';
		char ohr1 = '형';
		char ohr2 = '록';
		System.out.println((int)ohr);
		System.out.println((int)ohr1);
		System.out.println((int)ohr2);
		
		int num2 = 50724;
		int num3 = 54805;
		int num4 = 47197;
		System.out.println((char)num2);
		System.out.println((char)num3);
		System.out.println((char)num4);
		
		char ch6 = 'ァ';
		System.out.println((int)ch6);
		
		char ch7 = 'ぁ';
		System.out.println((int)ch7);

	}

}
