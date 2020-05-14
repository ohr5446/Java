/*
	
	Date : 2020.05.08
	Author : HyeongRok
	Description : Java 기본설정
	Version : 1.0

*/

package Java0508;

public class ex02_String {

	public static void main(String[] args) {
		//char의 계열인 String =>> char[~~]식으로 표기되는것을 String으로 쉽게입력
		
		String str1 = "자바 ";
		String str2 = "재미있어";
		String str3 = "너무어려워";
		
		String result;					// 변수선언
		result = str1 + str2;			// 변수초기화
		//System.out.println(result);		
		//자바 재미있어
		
		result = str1 + str3;			// 변수초기화
		//System.out.println(result);
		//자바 너무어려워
		
		result = str1 + 8.0;
		//System.out.println(result);
		//자바 8.0
		
		System.out.println(str1 + str2);
		System.out.println(str1 + "너무 " + str2);
		//자바 재미있어
		//자바 너무 재미있어
		
		//System.out.println((int)result); //String에서는 int 사용불가

	}

}
