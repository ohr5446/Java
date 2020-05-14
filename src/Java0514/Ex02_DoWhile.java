/*
	
	Date : 2020.05.14
	Author : HyeongRok
	Description : do_while문
	Version : 1.4

*/

package Java0514;

public class Ex02_DoWhile {

	public static void main(String[] args) {
		// do-while
		
		// while과 do-while의 차이점
		// while 은 반복문 실행하기전 조건식 검사
		// do-while은 반복문 실행 후 조건식 검사
		// do-while은 무조건 한번은 실행
		
		/*
			do{
				반복할 내용
			} while(조건식);
		*/
		
		int i = 11;
		
		do {
			System.out.println("do-while에서 i값 : " + i);
			i++;
		} while(i <= 10);
		
//		while(i <= 10) {
//			System.out.println("while에서 i값 : " + i);
//			i++;
//		}
		

	}

}
