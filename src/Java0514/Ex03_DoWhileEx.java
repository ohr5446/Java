/*
	
	Date : 2020.05.14
	Author : HyeongRok
	Description : do_while문 예제(Up&Down 게임)
	Version : 1.4

*/

package Java0514;

import java.util.Scanner;

public class Ex03_DoWhileEx {

	public static void main(String[] args) {
		// 3번 안에 맞추면 통과!
		// 그 이후에 맞추면 벌칙!

		int answer = (int) (Math.random() * 45) + 1;
		int input = 0;
		int count = 0;

		boolean run = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("Up & Down Game시작!");
		

		do {

			System.out.println("1부터 45까지 숫자를 말하세요!");
			input = sc.nextInt();
			count++;
						
			if (answer > input) {
				System.out.println("Up! 더 큰수를 말하세요!");
			} else if (answer < input) {
				System.out.println("Down! 더 작은수를 말하세요!");
			} else {
				System.out.println("정답은" + answer + " 입니다!");
				System.out.println("시도한 횟수는 " + count + "번 입니다.");
				run = false;
				// break;
			}

		} while (run);
		if (count > 3) {
			System.out.println("시도한 횟수가 3번이 넘어서 벌칙!");
		} else {

			System.out.println("3번 안에 맞춰서 통과!");
		}

	}

}
