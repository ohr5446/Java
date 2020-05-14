/*
	
	Date : 2020.05.08
	Author : HyeongRok
	Description : Java 기본설정
	Version : 1.0

*/

package Java0508;

public class ex_변수 {

	public static void main(String[] args) {
		
		// 변수 : 프로그램 실행에 필요한 데이터를 저장하기
		// 위해 메모리 공간을 할당하고, 이름을 부여한것
		
		// var num = 0;
		// [변수타입] [변수명] = [변수값];
		
		int age = 35;
		
		int age1;  // 변수선언
		age1 = 35; // 변수초기화 (가장 마지막값이 적용되고 이전 적용된값은 초기화된다.)
		
		
		// 변수타입	: 1byte	 2byte	 4byte	 8byte
		
		// 1. 정수형      :byte	 short    int	 long
		//------------------------------------------
		// 2. 실수형      :float, double
		// 3. 문자형      :char (String은 char[])
		// 4. 논리형      :boolean
		
		//1byte : -128(-2^7) ~ 127((2^7) - 1)
		byte bNum1 = -128;
		byte bNum2 = 127;
		
		// short
		// 2byte = 16bit
		// 2byte = 2^15 ~ (2^15)-1
		
		short sNum1 = -32768;
		short sNum2 = 32767;
		//short sNum3 = -32769; //short범위에 포함되지않는 숫자이므로 오류 발생
		//short sNum4 = 32768; // "
		
		//4byte = 32bit
		//4byte = -2^32 ~ (2^32)-1
		//int : -2,147,483,648 ~ 2,147,483,647
		int bNum3 = -129;
		int bNum4 = 128;
		
		// 8byte = 64bit
		// long : 매우크다
		
		int iNum1 = -2147483648;
		int iNum2 = 2147483647;
		
		//int iNum1 = -2147483648;
		//int iNum4 = 2123147483648;
		
		long iNum3 = -13221474000083648L;
		long iNum4 = 21231000047483648L;
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		float pi1 = 3.14f;
		double pi2 = 3.14;
		
		System.out.println(pi1);
		System.out.println(pi2);
		
		// long은 변수값 끝에 L추가
		// float은 변수값 끝에 f추가
	}

}
