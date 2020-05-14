/*
	
	Date : 2020.05.08
	Author : HyeongRok
	Description : Java 기본설정
	Version : 1.0

*/

package Java0508;

public class ex02_variableExample {

	public static void main(String[] args) {
		// 변수이름
		// 1. 카멜표기법 : 시작은 소문자, 다른뜻 단어가 
		// 등장할때 대문자를 사용해서 표기
		// ex) jInfo , document.getElementsByName, 학생수를 표시 ==>> numberOfStudent
		// 2. 영문자, 숫자, 특수문자( _(언더바), $ ) 사용가능
		// 3. 변수명은 숫자로 시작할 수 없다.
		// 4. 변수명은 예약어(int, double 등) 사용할 수 없다.
		
		int int;
		int double;
		
		
		 
		int 123;			//(;사용하였기에)오류발생
		int 1number;		//(숫자로시작하였기에)오류발생
		 
		int number1;
		int _number;
		int number_;
		 
		int $number;
		int number$;
		 
		int #number;		//(사용불가한 특수문자사용으로)오류발생
		int number#;		// 〃
		int number&;		// 〃
		int a;
		 
		

	}

}
