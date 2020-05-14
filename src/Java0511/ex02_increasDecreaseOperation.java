/*
	
	Date : 2020.05.11
	Author : HyeongRok
	Description : 증감연산자(increasDecreaseOperation)
	Version : 1.1

*/

package Java0511;

public class ex02_increasDecreaseOperation {

	public static void main(String[] args) {
		// 단항연산자
		// 증가 감소 연산자( ++ , -- )
		
		// ++num : num이 가지고 있는 값에
		// 1을 증가한 뒤에 연산에 적용
		// num++ : num이 가지고 있는 값을
		// 연산에 적용한 뒤 1을 증가
		
		int num = 5;
		System.out.println("num값 : " + num);
		
		++num;
		System.out.println("++num 값 : " + num);
		
		num++;
		System.out.println("num++ 값 : " + num);
		
		int num1 = 5;
		int result1;
		
		result1 = ++num1;
		System.out.println("++num result1 : " + result1);
		// result1 = ++num1;
		// num1 = num1 + 1
		// result1 = num1;
		
		result1 = num1++;
		System.out.println("num1++ result1 : " + result1);
		// result1 = num1++;
		// result1 = num1;
		// num1 = num1 + 1;
		
		// example
		
		int num2 = 10;
		--num2; 
		System.out.println(num2); //9
		// num2 = num2 - 1;
		// num2 = 10 - 1;
		// num2 = 9;
		
		int result2;
		result2 = --num2;
		System.out.println(num2); //8
		// result2 = --num2;
		// num2 = num2 - 1;
		// num2 = 9 - 1;
		// result2 = num2;
		// result2 = 8
				
		result2 = num2--;
		System.out.println(num2); 
		// result2 = num2--;
		// result2 = num2;
		// result2 = 8;
		// num2 = num2 - 1;
		// num2 = 8 - 1;
		// num2 = 7
				 	
		int result3;
		System.out.println("num1 : " + num1 + "num2 : " + num2);
		result3 = ++num1 + ++num2;
		System.out.println(num1); //8
		System.out.println(num2); //8
		System.out.println(result3); //16
		
		// num1 = 8 , num2 = 8;
		result3 = num1++ + num2++;
		System.out.println(num1); //9
		System.out.println(num2); //9
		System.out.println(result3); //16
		// num1 = num1;
		// +
		// num2 = num2;
		// =
		// result3
		// 계산후
		// num1 = num1+1;
		// num2 = num2+1;
		
		
		// num1 = 9, num2 = 9;	
		result3 = num1++ + ++num2;
		System.out.println(num1); //10
		System.out.println(num2); //10
		System.out.println(result3); //19
		
		result3 = ++num1 + num2++;
		System.out.println(num1); //11
		System.out.println(num2); //11
		System.out.println(result3); //21
		
		int num3 = 5;
		int num4 = 11;
		int result4;
		
		result4 = ++num3 + --num4; //6 + 10 = 16
		System.out.println(result4);
		result4 = num4++ - num3--; //10 - 6 = 4
		System.out.println(result4);
		result4 = num3++ - ++num4; //5 - 12 = -7
		System.out.println(result4);
		

	}

}
