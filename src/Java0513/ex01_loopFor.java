/*
	
	Date : 2020.05.13
	Author : HyeongRok
	Description : 반복문for
	Version : 1.3

*/

package Java0513;

public class ex01_loopFor {

	public static void main(String[] args) {
		/*
			          ←←←←←←←
		              ↓      ↑  
		for(초기화식; 조건식; 증감식) {
		  int i=1; → 참일때; ↗
					  ↙        ↗
			반복할 수행문   ↗
		
		}
		
		*/
		int i = 0;
		for(i = 1; i<=10; i++) {
			
			System.out.println(i);
		}
		System.out.println("반복문 종료 후 i값 : " + i);
		
		
		
		
		
	}

}
