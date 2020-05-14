/*
	
	Date : 2020.05.13
	Author : HyeongRok
	Description : whileExample
	Version : 1.3

*/

package Java0513;

public class ex11_whileEx {

	public static void main(String[] args) {
		// while문을 이용해서
		// 주사위를 던졌을때
		// 5가 나오면 종료하는 프로그램을 만드시오!
		
		
		
		boolean run = true;
		int cnt = 0;
		
		while (run) {
			
			int dice = (int)(Math.random() * 6 ) + 1;
			cnt++;
			System.out.println("주사위값 : " + dice);
			
			if (dice == 5) {
			run = false;
			}
		}
		System.out.println("\n던진 횟수 : " + cnt);
		System.out.println("프로그램을 종료합니다.");

	}

}
