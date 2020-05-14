/*
	
	Date : 2020.05.13
	Author : HyeongRok
	Description : continue문
	Version : 1.3

*/

package Java0513;

public class ex03_continue {
	
	public static void main(String[] args) {
		
		// continue문은 반복문과 함께 사용
		// 반복문 안에서 continue문을 만나면
		// 이후 문장은 수행하지 않고
		// for문의 증감식을 수행한다.
		
		/*
				  (1)	 (2)    (4)
			for(초기화식; 조건식; 증감식) {
				  (3) >> 거짓일경우 반복문수행으로 //참일경우 증감식으로
				특정조건
				continue;
				   (4)
				반복문 수행;
			}
		
		*/
		
//		for(int i = 1; i <= 10; i++) {
//			
//			if(i%2 == 0) {
//				continue;
//			} // 2 4 6 8 10
//			
//			System.out.println(i);
//			// 1 3 5 7 9
//		}
		
		// 1부터 100까지 숫자중에
		// 짝수의 합을 구하는 문제!
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			if(i%2 == 1) {
				continue;
			}
			
			sum += i;
			System.out.println(i);
		}
		System.out.println("1부터 100까지 숫자중에 짝수의 합은 : " + sum);
		
		
		
		
	}

}
