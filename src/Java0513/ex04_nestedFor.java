/*
	
	Date : 2020.05.13
	Author : HyeongRok
	Description : 중첩for문
	Version : 1.3

*/

package Java0513;

public class ex04_nestedFor {
	
	public static void main(String[] args) {
		
		// 중첩for문
		
		/*
			for(초기화식; 조건식; 증감식) {
				
				for(초기화식; 조건식; 증감식){
					실행할 반복문
				}
			}
		*/
		
		for(int i = 1; i <= 2; i++) {
			
			for(int j = 1; j <= 3; j++) {
				System.out.print("i값 : " + i);
				System.out.println("\tj값 : " + j);
			}
		System.out.println("======================");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
