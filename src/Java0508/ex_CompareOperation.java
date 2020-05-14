/*
	
	Date : 2020.05.08
	Author : HyeongRok
	Description : CompareOperation
	Version : 1.0

*/
package Java0508;

public class ex_CompareOperation {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		
		boolean result;
		result = num1 > num2;
		System.out.println("num1 > num2 : " + result);
		System.out.println(num1 + ">" + num2 +  ":"  + result);
		
		result = num1 < num2;
		System.out.println("num1 < num2 : " + result);
		System.out.println(num1 + "<" + num2 + ":" + result);
		
		// num1과 num2가 같다.
		// 두개의 정수가 같은지 비교할 떄 : '=='
		result = num1 == num2;
		System.out.println("num1 = num2 : " + result);
		System.out.println(num1 + "=" + num2 + ":" + result);
		
		//num1과 num2가 다르다.
		//두개의 정수가 다른지 비교할 때 : '!='
		result = num1 != num2;
		System.out.println("num1 != num2 : " + result);
		System.out.println(num1 + "!=" + num2 + ":" + result);
		
		// 중요!!
		// 문자열 같은지 비교
		
		String str1 = "Java";
		String str2 = "Java";
		String str3 = "자바";
		
		//문자열 두개가 같은지 비교할 때
		//변수명1.equals(변수명2) 라는 문법으로 사용
		result = str1.equals(str2);
		System.out.println("str1과 str2의 문자비교 : " + result);
		
		result = str1.equals(str3);
		System.out.println("str1과 str3의 문자비교 : " + result);
		
		

	}

}
